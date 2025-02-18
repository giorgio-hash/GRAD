package model.yaml;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Mappa della struttura delle dipendenze.<br>
 * Le dipendenze sono gestite tramite il DependencyMapper e gli oggetti su cui si appoggia:<br>
 * <ul>
 *     <li><i>{@link DependencyMapper}</i>: contiene la lista delle strutture di dipendenza;</li>
 *     <li><i>{@link Dependency}</i>: una struttura che definisce le dipendenze verso un certo esame;</li>
 *     <li><i>{@link ExamDependency}</i>: elemento che definisce una dipendenza <i>soft</i> o <i>strict</i> nella <i>Dependency</i>.</li>
 * </ul>
 * La struttura in cui questi vengono mappati segue questa gerarchia di contenimento:<br><br>
 *  <i>DependencyMapper</i><br>
 *  &nbsp;&nbsp;&#9492;&#9472;<i>Dependency</i><br>
 *  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&#9492;&#9472;<i>ExamDependency</i><br>
 * <br>La struttura può essere estratta da file YAML con la parola chiave <tt>dependencies</tt> seguita da una lista di oggetti <i>Dependency</i> opportunamente codificati:<br><br>
 * <tt>dependencies:</tt><br>
 *  &nbsp;&nbsp;&#9500;&#9472;<i>Dependency</i><br>
 *  &nbsp;&nbsp;&#9500;&#9472;<tt>...</tt><br>
 *  &nbsp;&nbsp;&#9492;&#9472;<i>Dependency</i><br>
 */
public class DependencyMapper {

	private List<Dependency> dependencies;
	private Map<String,Dependency> dependenciesMap;


	/**
	 * Crea una <i>HashMap</i> per organizzare le dipendenze in una struttura ottimizzata chiave->valore.
	 */
	public void mapDependencies(){
		dependenciesMap = new HashMap<String,Dependency>();
		for(Dependency d : dependencies){
			dependenciesMap.put(d.getDependency(),d);
		}
	}

	/**
	 * Dato il nome di un esame come chiave, restituisce la <i>Dependency</i> corrispondente.
	 * @param exam nome <i>String</i> dell'esame
	 * @return oggetto <i>Dependency</i> corrispondente
	 */
	public Dependency getDependency(String exam){
        return dependenciesMap.getOrDefault(exam, null);
	}


	/**
	 * Verifica che la <i>DependencyMap</i> non sia vuota.
	 * @return <tt>true</tt> se condizione verificata, <tt>false</tt> altrimenti
	 */
	public boolean hasDependencies(){
		return !dependencies.isEmpty();
	}

	/**
	 * Verifica se la <i>DependencyMap</i> contiene un oggetto <i>Dependency</i> per l'esame con nome in input.
	 * @param exam nome esame <i>String</i>
	 * @return <tt>true</tt> se condizione verificata, <tt>false</tt> altrimenti
	 */
	public boolean hasDependency(String exam){
		return dependenciesMap.containsKey(exam);
	}

	/**
	 * Dato un nome esame in input, verifica se la <i>Dependency</i> contiene delle <i>ExamDependency</i> di tipo <i>strict</i>.
	 * @param exam nome esame <i>String</i>
	 * @return <tt>true</tt> se condizione verificata, <tt>false</tt> altrimenti
	 */
	public boolean hasStrictDependencies(String exam){
		if(hasDependencies() || !hasDependency(exam))
			return false;

		if(dependenciesMap.get(exam).getStrict_dependencies() == null)
			return false;
		return !dependenciesMap.get(exam).getStrict_dependencies().isEmpty();
	}

	/**
	 * Dato un nome esame in input, verifica se la <i>Dependency</i> contiene delle <i>ExamDependency</i> di tipo <i>soft</i>.
	 * @param exam nome esame <i>String</i>
	 * @return <tt>true</tt> se condizione verificata, <tt>false</tt> altrimenti
	 */
	public boolean hasSoftDependencies(String exam){
		if(hasDependencies() || !hasDependency(exam))
			return false;

		if(dependenciesMap.get(exam).getSoft_dependencies() == null)
			return false;
		return !dependenciesMap.get(exam).getSoft_dependencies().isEmpty();
	}

	/**
	 * Ritorna una lista di tutti gli oggetti <i>Dependency</i> definiti in <i>DependencyMapper</i>.
	 * @return <i>List</i> di oggetti <i>Dependency</i>
	 */
	public List<Dependency> getDependencies() {
		return dependencies;
	}

	/**
	 * Serve a SnakeYAML
	 * @param dependencies
	 */
	public void setDependencies(List<Dependency> dependencies) {
		this.dependencies = dependencies;
	}


	@Override
	public String toString() {
		
		String s = "DependencyMapper [dependencies=\n";
		for (Dependency dependency : dependencies) {
			s += "\t"+dependency+",\n";
		}
		
		return  s + "]";
	}
	
	
}
