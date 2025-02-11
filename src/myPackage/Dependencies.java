package myPackage;

import myPackage.YAMLutils.DependencyManager;
import org.yaml.snakeyaml.Yaml;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.PrintWriter;

public class Dependencies {

    private static Dependencies instance=null;
    private String path;
    DependencyManager data;

    private Dependencies(){
        this.path=".\\resources\\career.yaml";
    }

    public static Dependencies getInstance(){
        if(instance == null)
            return new Dependencies();
        return instance;
    }

    public DependencyManager loadYAML(){
        InputStream inputStream = null;
        try {
            inputStream = new FileInputStream(path);
            Yaml yaml = new Yaml();
            data = yaml.loadAs(inputStream,DependencyManager.class);
        } catch (FileNotFoundException e) {
            System.out.println("File non trovato o non compilabile.");
            return null;
        }

        data.mapDependencies();
        return data;
    }

    public DependencyManager loadYAML(String path){
        InputStream inputStream = null;
        try {
            inputStream = new FileInputStream(path);
            Yaml yaml = new Yaml();
            data = yaml.loadAs(inputStream,DependencyManager.class);
        } catch (FileNotFoundException e) {
            System.out.println("File non trovato o non compilabile.");
            return null;
        }
        data.mapDependencies();
        return data;
    }

    public DependencyManager getDependencyManager(){
        return data;
    }


}
