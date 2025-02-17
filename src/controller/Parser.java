package controller;

import compiler.GRADLexer;
import compiler.GRADParser;
import org.antlr.runtime.ANTLRReaderStream;
import org.antlr.runtime.CommonTokenStream;

import java.io.*;
import java.util.ArrayList;

public class Parser {

    private GRADParser parser;
    private String fileIn;
    private boolean otherExceptions;

    private static Parser instance = null;

    public static Parser getInstance() {
        if (instance == null) {
            instance = new Parser();
        }
        return instance;
    }
    private Parser() {
        fileIn = ".\\resources\\career.GRAD";
        parser = null;
    }

    public void setFileIn(String fileIn) {
        this.fileIn = fileIn;
    }

  	public void parse(){
        otherExceptions = false;
        try {
            // Inizializzazione del parser (antlr docet):
            //		1. Si inizializza il lexer
            //		2. Si crea uno stream di token
            //		3. si istanzia il parser passandogli lo stream di token

            // 1.
            GRADLexer lexer = new GRADLexer (
                    new ANTLRReaderStream(
                            new FileReader(fileIn)));

            // 2.
            CommonTokenStream tokens = new CommonTokenStream (lexer);

            // 3.
            parser = new GRADParser (tokens);


            // 4. si lancia il parser dallo start simbol (prima produzione specificata)
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

    public ArrayList<String> getErrors(){
        return parser.getHandler().getErrors();
    }

    public boolean hasErrors(){
        return parser.getHandler().hasErrors();
    }

    public ArrayList<String> getWarnings(){
        return parser.getHandler().getWarnings();
    }

    public boolean hasWarning(){
        return parser.getHandler().hasWarning();
    }
    public boolean hasOtherExceptions(){
        return otherExceptions;
    }

    private void dumpToFile(ArrayList<String> toWrite, String path){
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
