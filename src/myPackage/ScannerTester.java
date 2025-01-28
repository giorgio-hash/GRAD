package myPackage;

import java.io.FileReader;
import java.io.IOException;
import java.util.Hashtable;
import java.util.Properties;

import org.antlr.runtime.ANTLRReaderStream;
import org.antlr.runtime.Token;

import myCompilerPackage.GRADLexer;


public class ScannerTester {

	public static void main(String[] args) throws IOException {
		// inserire il path-name del file di input
	  	String fileIn = ".\\resources\\career.GRAD";
	
	  	Token tk;

		try {
			System.out.println ("Test ANTLR lexer");
			
			// lettura dei nomi delle classi di token nel file .tokens
			FileReader reader=new FileReader(".\\src\\myCompilerPackage\\GRAD.tokens");
			Properties prop = new Properties();
			prop.load(reader);
			Hashtable<String, String> tokenNames = new Hashtable<String, String>();
			// bisogna invertire le chiavi con i valori...
			for (String key : prop.stringPropertyNames()) 
			    tokenNames.put((String)prop.get(key), key);
			
			// istanzio lo scanner passandogli un stream di ingresso
			GRADLexer lexer = new GRADLexer (
											new ANTLRReaderStream(
													new FileReader(fileIn)	)	); 
			
			int i = 1;			// contatore di token

			// attivo un ciclo che scandisce lo stream dall'inizio alla fine
			// richiedendo ogni volta allo scanner di fornire il token successivo (metodo nextToken)
			// fino ad incontrare l' End Of File EOF
			while ((tk = lexer.nextToken()).getType() != GRADLexer.EOF) {
				// recuper le informazioni relative ai token rilevati
				int line = tk.getLine();
				int col = tk.getCharPositionInLine()+1;
				String type = ""+tk.getType();
				String tokenType = tokenNames.get(type);
				String text = tk.getText();

				// attivo questo controllo se voglio scartare i token nascosti - de/commentare solo l'IF
				if (tk.getChannel() != GRADLexer.HIDDEN)
					// stampo le informazioni del token corrente
					System.out.println("Token " + i++ + ": "
							+ "(" + line + "," + col + ")\t\t" 
							+ "TokenType: " + tokenType + " (" + type + ")\t" 
							+ text + "\t");
			} 
		} catch (Exception e) {
			System.out.println ("Test ANTLR abortito");
			e.printStackTrace();
		}

	}
  	
}
