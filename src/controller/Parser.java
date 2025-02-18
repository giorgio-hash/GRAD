package controller;

import compiler.GRADLexer;
import compiler.GRADParser;
import org.antlr.runtime.ANTLRReaderStream;
import org.antlr.runtime.CommonTokenStream;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Parser <i>GRAD</i> definito con pattern singleton.
 */
public class Parser {

    private GRADParser parser;
    private String fileIn;
    private boolean otherExceptions;

    //pattern singleton
    private static Parser instance = null;

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
            parser.degreeRule();

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
            for(String s : toWrite){
                out.write(s);
                out.newLine();
            }
            out.close();
        } catch (Exception e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
