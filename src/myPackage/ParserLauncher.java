package myPackage;

import java.io.FileReader;

import org.antlr.runtime.ANTLRReaderStream;
import org.antlr.runtime.CommonTokenStream;

//import myCompilerPackage.SemanticHandler;
import myCompilerPackage.GRADLexer;
import myCompilerPackage.GRADParser;

/* 
 * Questa � una classe di esempio
 * che simula un'applicazione 
 * che vuole usare un parser
 */
public class ParserLauncher {
	public static void main(String[] args) {
		GRADParser parser;
		String fileIn = ".\\resources\\career.GRAD";
  	
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
	    System.out.println("Tutto ok");
  	} catch (Exception e) {
			System.out.println ("Parsing con ANTLR abortito\n\n");
			e.printStackTrace();
		}
  }

}
