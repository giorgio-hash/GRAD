package controller;

import compiler.GRADLexer;
import compiler.GRADParser;
import org.antlr.runtime.ANTLRReaderStream;
import org.antlr.runtime.CommonTokenStream;

import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

/**
 * Parser <i>GRAD</i> definito con pattern singleton.
 * <br>Dopo aver letto il file GRAD, può creare dei dump file contenenti errori, warning ed altre eccezioni.
 * <br>In presenza di errori, Parser è programmato per abortire la realizzazione di {@link Degree}, reinizializzandolo allo stato iniziale.
 */
public class Parser {

    /**
     * istanza di <i>GRADparser</i> (classe generata da <a href="https://www.antlr3.org/">ANTLRv3</a>).
     */
    private GRADParser parser;
    /**
     * percorso al file GRAD da leggere
     */
    private String fileIn;
    /**
     * inizializzato <tt>false</tt>, diventa <tt>true</tt> se vengono catturate eccezioni non previste.
     */
    private boolean otherExceptions;

    /**
     * istanza del pattern singleton
     */
    private static Parser instance;

    /**
     * Metodo statico che restituisce l'oggetto statico <i>Parser</i> (pattern singleton).
     * @return oggetto <i>Parser</i>
     */
    public static Parser getInstance() {
        if (instance == null) {
            instance = new Parser();
        }
        return instance;
    }

    /**
     * Costruttore privato (pattern Singleton)
     */
    private Parser() {
        fileIn = ".\\resources\\career.GRAD";
        parser = null;
    }


    /**
     * Esegue la lettura di un file GRAD al percorso specificato, che di default è: "<tt>.\resources\career_witherrs.GRAD</tt>".
     * <br> Questo metodo può catturare errori, warning ed eccezioni impreviste (vedi <tt>hasOtherExceptions</tt>).
     * <ol>
     *     <li>Inizializza il lexer;</li>
     *     <li>Crea uno stream di token;</li>
     *     <li>Istanzia il parser con lo stream di token;</li>
     *     <li>Lancia il parser dallo Start Symbol;</li>
     *     <li>verifica la presenza di errori ed esegue dump nel caso.</li>
     * </ol>
     */
  	public void parse(){
        otherExceptions = false;
        try {

            //Inizializza il lexer
            GRADLexer lexer = new GRADLexer (
                    new ANTLRReaderStream(
                            new FileReader(fileIn)));

            //Crea uno stream di token
            CommonTokenStream tokens = new CommonTokenStream (lexer);

            //Istanzia il parser passandogli lo stream di token
            parser = new GRADParser (tokens);


            //Lancia il parser dallo start simbol (prima produzione specificata)
            parser.startRule();

            if(hasErrors()) {
                Degree.getDegree().reset();
                dumpToFile(getErrors(),"errors.log");
            }

            if(hasWarning()){
                dumpToFile(getWarnings(),"warnings.log");
            }
        } catch (Exception e) {
            System.out.println ("Parsing con ANTLR abortito\n\n");
            otherExceptions = true;
            Degree.getDegree().reset();
            e.printStackTrace();
        }
    }

    /**
     * Ritorna la lista di errori in fase di compilazione
     * @return <i>List</i> di frasi descrittive <i>String</i>
     */
    public List<String> getErrors(){
        return parser.getHandler().getErrors();
    }

    /**
     * Verifica la presenza di errori in fase di compilazione
     * @return <tt>true</tt> se condizione verificata, <tt>false</tt> altrimenti
     */
    public boolean hasErrors(){
        return parser.getHandler().hasErrors();
    }

    /**
     * Ritorna la lista di warning in fase di compilazione
     * @return <i>List</i> di frasi descrittive <i>String</i>
     */
    public List<String> getWarnings(){
        return parser.getHandler().getWarnings();
    }

    /**
     * Verifica la presenza di warning in fase di compilazione
     * @return <tt>true</tt> se condizione verificata, <tt>false</tt> altrimenti
     */
    public boolean hasWarning(){
        return parser.getHandler().hasWarning();
    }

    /**
     * Verifica se, in fase di compilazione, sia stata innescata qualsiasi altra <i>Exception</i> non controllata.
     * @return <tt>true</tt> se condizione verificata, <tt>false</tt> altrimenti
     */
    public boolean hasOtherExceptions(){
        return otherExceptions;
    }

    /**
     * Utile per la creazione di file di log, dove conservare errori, warning e altre informazioni importanti.
     * @param toWrite lista di stringhe da scrivere
     * @param path percorso al file da scrivere/sovrascrivere
     */
    private void dumpToFile(List<String> toWrite, String path){
        try {
            File file = new File(path);
            BufferedWriter out = new BufferedWriter(new FileWriter(file));
            out.write("Esecuzione "+LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm")));
            out.newLine();
            for(String s : toWrite){
                out.write(s);
                out.newLine();
            }
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * modifica il percorso al file grad
     * @param path percorso file
     */
    public void setFileIn(String path){
        this.fileIn = path;
    }
}
