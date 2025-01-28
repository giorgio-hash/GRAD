package myCompilerPackage;

import java.util.Hashtable;

import java.util.Stack;

import org.antlr.runtime.Token;
//import myCompilerPackage.util.*;

public class SemanticHandler {
	
	private static SemanticHandler h;
	
	private SemanticHandler() {

		
	}

	public static SemanticHandler getHandler () {
		if (h == null)
			h = new SemanticHandler();
		return h;
	}
	
	

}
