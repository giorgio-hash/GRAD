package controller;

import model.yaml.DependencyMapper;
import org.yaml.snakeyaml.Yaml;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class DependencyManager {

    private static DependencyManager instance=null;
    private String path;
    DependencyMapper data;

    private DependencyManager(){
        this.path=".\\resources\\career.yaml";
    }

    public static DependencyManager getInstance(){
        if(instance == null)
            return new DependencyManager();
        return instance;
    }

    public DependencyMapper loadYAML(){
        InputStream inputStream = null;
        try {
            inputStream = new FileInputStream(path);
            Yaml yaml = new Yaml();
            data = yaml.loadAs(inputStream, DependencyMapper.class);
        } catch (FileNotFoundException e) {
            System.out.println("File non trovato o non compilabile.");
            return null;
        }

        data.mapDependencies();
        return data;
    }

    public DependencyMapper loadYAML(String path){
        InputStream inputStream = null;
        try {
            inputStream = new FileInputStream(path);
            Yaml yaml = new Yaml();
            data = yaml.loadAs(inputStream, DependencyMapper.class);
        } catch (FileNotFoundException e) {
            System.out.println("File non trovato o non compilabile.");
            return null;
        }
        data.mapDependencies();
        return data;
    }

    public DependencyMapper getDependencyMapper(){
        return data;
    }


}
