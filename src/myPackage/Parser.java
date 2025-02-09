package myPackage;

import myCompilerPackage.GRADLexer;
import myCompilerPackage.GRADParser;
import org.antlr.runtime.ANTLRReaderStream;
import org.antlr.runtime.CommonTokenStream;

import java.io.FileReader;

public class Parser {

    private GRADParser parser;
    private String fileIn;

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

            for(String e : parser.getHandler().getErrors()){
                System.out.println(e);
            }
            for(String e : parser.getHandler().getWarnings()){
                System.out.println(e);
            }
        } catch (Exception e) {
            System.out.println ("Parsing con ANTLR abortito\n\n");
            e.printStackTrace();
        }
    }
}
