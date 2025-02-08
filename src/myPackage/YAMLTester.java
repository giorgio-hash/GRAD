
package myPackage;

import org.yaml.snakeyaml.Yaml;
import myPackage.YAMLutils.DependencyManager;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;


public class YAMLTester {
    
    public static void main(String[] args) {
    	InputStream inputStream = null;
		try {
			inputStream = new FileInputStream(".\\resources\\career.yaml");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

    	Yaml yaml = new Yaml();
    	DependencyManager data = yaml.loadAs(inputStream,DependencyManager.class);
    	System.out.println(data);
    	
    }
}
