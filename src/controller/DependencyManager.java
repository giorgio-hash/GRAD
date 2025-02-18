package controller;

import model.compiler.Exam;
import model.yaml.Dependency;
import model.yaml.DependencyMapper;
import model.yaml.ExamDependency;
import org.yaml.snakeyaml.Yaml;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * Classe per la gestione delle dipendenze tra esami. Usa il pattern <i>singleton</i>.<br>
 * Le dipendenze sono gestite tramite il DependencyMapper e gli oggetti su cui si appoggia:
 * <ul>
 *     <li><i>DependencyMapper</i>: contiene la lista delle strutture di dipendenza;</li>
 *     <li><i>Dependency</i>: una struttura che definisce le dipendenze verso un certo esame;</li>
 *     <li><i>ExamDependency</i>: elemento che definisce una dipendenza <i>soft</i> o <i>strict</i> nella <i>Dependency</i>.</li>
 * </ul>
 * La struttura in cui questi vengono mappati segue questa gerarchia di contenimento:<br><br>
 *  <i>DependencyMapper</i><br>
 *  &nbsp;&nbsp;&#9492;&#9472;<i>Dependency</i><br>
 *  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&#9492;&#9472;<i>ExamDependency</i>
 */
public class DependencyManager {

    //path per il file YAML dove verranno lette le dipendenze
    private String path;

    //oggetto che mappa le dipendenze
    private static DependencyMapper data;


    //pattern singleton
    private static DependencyManager instance=null;

    /**
     * Costruttore privato (pattern Singleton)
     */
    private DependencyManager(){
        this.path=".\\resources\\career.yaml";
    }

    /**
     * Metodo statico che restituisce l'oggetto statico <i>DependencyManager</i> (pattern singleton).
     * @return oggetto <i>DependencyManager</i>
     */
    public static DependencyManager getInstance(){
        if(instance == null)
            return new DependencyManager();
        return instance;
    }

    /**
     * Metodo per la lettura di un file YAML conforme alla struttura del modello su cui DependencyManager si appoggia (vedi documentazione).
     * <ul>
     *     <li>Se il file viene trovato e letto, si crea il <i>DependencyMapper</i>;</li>
     *     <li>Altrimenti, <i>DependencyMapper</i> è <tt>null</tt>.</li>
     * </ul>
     * <br>Di default, il path per il file da leggere è "<tt>.\resources\career.yaml</tt>".
     *
     */
    public void loadYAML(){
        InputStream inputStream = null;
        try {
            inputStream = new FileInputStream(path);
            Yaml yaml = new Yaml();
            data = yaml.loadAs(inputStream, DependencyMapper.class);
            data.mapDependencies();
        } catch (FileNotFoundException e) {
            System.out.println("File non trovato o non compilabile.");
            data=null;
        }
    }

    /**
     * Verifica che il <i>DependencyMapper</i> sia stato creato.
     * @return <tt>true</tt> se condizione verificata, <tt>false</tt> altrimenti
     */
    public boolean hasDependencyMapper(){
        return data != null;
    }

    /**
     * Restituisce l'oggetto <i>Dependency</i> con cui vengono definite le dipendenze di un certo <i>Exam</i>.
     * @param e oggetto <i>Exam</i>
     * @return oggetto <i>Dependency</i>
     */
    public Dependency getDependency(Exam e){
        return data.getDependency(e.getName());
    }

    /**
     * Verifica se esiste un oggetto <i>Dependency</i> con cui vengono definite le dipendenze di un certo <i>Exam</i>.
     * @param e oggetto <i>Exam</i>
     * @return <tt>true</tt> se condizione verificata, <tt>false</tt> altrimenti
     */
    public boolean hasDependency(Exam e){
        if(data == null)
            return false;

        return data.hasDependency(e.getName());
    }

    /**
     * Verifica se il dependencyMapper contiene elementi <i>Dependency</i>
     * @return <tt>true</tt> se condizione verificata, <tt>false</tt> altrimenti
     */
    public boolean hasDependencies(){
        if(data == null)
            return false;

        return data.hasDependencies();
    }

    /**
     * Generalizzazione di <tt>hasDependencyLoaded</tt>.
     * <br>Scorre tutte le <i>Dependency</i> e verifica se, per almeno una realizzazione:
     * <ol>
     *     <li>L'esame descritto in <i>Dependency</i> sia definito come oggetto <i>Exam</i> in <i>Degree</i>;</li>
     *     <li>Una <i>ExamDependency</i> (<tt>strict</tt> o <tt>soft</tt>) abbia un corrispettivo oggetto <i>Exam</i> definito in <i>Degree</i>.</li>
     * </ol>
     *
     * @return <tt>true</tt> se condizione verificata, <tt>false</tt> altrimenti
     */
    public boolean hasAnyDependencyLoaded(){
        if(data == null)
            return false;

        for(Dependency d : data.getDependencies()){
            if(Degree.getDegree().hasExam(d.getDependency()) && hasDependencyLoaded(Degree.getDegree().getExam(d.getDependency()))){
                return true;
            }
        }
        return false;
    }

    /**
     * verifica se:
     * <ol>
     *     <li>L'oggetto <i>Exam</i> abbia un corrispettivo <i>Dependency</i> in <i>DependencyMapper</i>;</li>
     *     <li>In tale <i>Dependency</i>, almeno un <i>ExamDependency</i> (<tt>strict</tt> o <tt>soft</tt>) abbia corrispettivo <i>Exam</i> definito in <i>Degree</i>.</li>
     * </ol>
     * <br>In altre parole: se esistono, verifica che almeno una delle dipendenze (propedeutiche o consigliate) dell'esame sia effettivamente definita come esame nel GRAD.
     * @param e oggetto <i>Exam</i>
     * @return <tt>true</tt> se condizione verificata, <tt>false</tt> altrimenti
     */
    public boolean hasDependencyLoaded(Exam e){
        return hasDependency(e)
                && (hasStrictDependencyLoaded(e)
                || hasSoftDependencyLoaded(e));
    }

    /**
     * verifica se l'oggetto <i>Exam</i> ha delle dipendenze <tt>soft</tt>
     * @param e oggetto <i>Exam</i>
     * @return <tt>true</tt> se condizione verificata, <tt>false</tt> altrimenti
     */
    public boolean hasSoftDependencies(Exam e){
        if(data == null)
            return false;

        return data.hasSoftDependencies(e.getName());
    }

    /**
     * Verifica se l'oggetto <i>Exam</i> ha delle dipendenze <tt>soft</tt> con corrispettivo oggetto <i>Exam</i> definito in <i>Degree</i>
     * @param e oggetto <i>Exam</i>
     * @return <tt>true</tt> se condizione verificata, <tt>false</tt> altrimenti
     */
    public boolean hasSoftDependencyLoaded(Exam e){
        if(data == null)
            return false;
        if(!data.hasSoftDependencies(e.getName()))
            return false;

        for(ExamDependency d : data.getDependency(e.getName()).getSoft_dependencies()){
            if(Degree.getDegree().hasExam(d.getExam())) {
                return true;
            }
        }
        return false;
    }

    /**
     * Verifica se l'oggetto <i>Exam</i> ha delle dipendenze <tt>strict</tt>
     * @param e oggetto <i>Exam</i>
     * @return <tt>true</tt> se condizione verificata, <tt>false</tt> altrimenti
     */
    public boolean hasStrictDependencies(Exam e){
        if(data == null)
            return false;

        return data.hasStrictDependencies(e.getName());
    }

    /**
     * Verifica se l'oggetto <i>Exam</i> ha delle dipendenze <tt>strict</tt> con corrispettivo oggetto <i>Exam</i> definito in <i>Degree</i>
     * @param e oggetto <i>Exam</i>
     * @return <tt>true</tt> se condizione verificata, <tt>false</tt> altrimenti
     */
    public boolean hasStrictDependencyLoaded(Exam e){
        if(data == null)
            return false;
        if(!data.hasStrictDependencies(e.getName()))
            return false;

        for(ExamDependency d : data.getDependency(e.getName()).getStrict_dependencies()){
            if(Degree.getDegree().hasExam(d.getExam())) {
                return true;
            }
        }
        return false;
    }

    /**
     * Restituisce la lista di oggetti <i>Exam</i>, definiti in <i>Degree</i>, che hanno una corrispondenza nelle <i>Dependency</i>.
     * @return <i>List</i> di oggetti <i>Exam</i>
     */
    public List<Exam> getExamsWithDependencies(){
        List<Exam> list = new ArrayList<Exam>();
        for(Dependency d : data.getDependencies()){
            if(Degree.getDegree().hasExam(d.getDependency()) && hasDependencyLoaded(Degree.getDegree().getExam(d.getDependency()))){
                list.add(Degree.getDegree().getExam(d.getDependency()));
            }
        }
        return list;
    }

    /**
     * Dato un oggetto <i>Exam</i> in input, restituisce le relative dipendenze <tt>soft</tt> che abbiano un oggetto <i>Exam</i> definito in <i>Degree</i>.
     * @return <i>List</i> di oggetti <i>Exam</i>
     */
    public List<Exam> loadSoftDependencies(Exam e){
        List<Exam> list = new ArrayList<Exam>();
        if(!hasSoftDependencyLoaded(e))
            return list;
        for(ExamDependency d : data.getDependency(e.getName()).getSoft_dependencies()){
            if(Degree.getDegree().hasExam(d.getExam())) {
                list.add(Degree.getDegree().getExam(d.getExam()));
            }
        }
        return list;
    }

    /**
     * Dato un oggetto <i>Exam</i> in input, restituisce le relative dipendenze <tt>strict</tt> che abbiano un oggetto <i>Exam</i> definito in <i>Degree</i>.
     * @return <i>List</i> di oggetti <i>Exam</i>
     */
    public List<Exam> loadStrictDependencies(Exam e){
        List<Exam> list = new ArrayList<Exam>();
        if(!hasStrictDependencyLoaded(e))
            return list;
        for(ExamDependency d : data.getDependency(e.getName()).getStrict_dependencies()){
            if(Degree.getDegree().hasExam(d.getExam())) {
                list.add(Degree.getDegree().getExam(d.getExam()));
            }
        }
        return list;
    }



}
