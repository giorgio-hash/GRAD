package controller;

import model.compiler.Exam;
import model.yaml.Dependency;
import model.yaml.DependencyMapper;
import model.yaml.ExamDependency;
import org.yaml.snakeyaml.Yaml;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class DependencyManager {

    private String path;
    private static DependencyMapper data;
    private static DependencyManager instance=null;

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

    public DependencyMapper getDependencyMapper(){
        return data;
    }

    public boolean hasDependency(Exam e){
        if(data == null)
            return false;

        return data.hasDependency(e.getName());
    }

    public boolean hasDependencies(){
        return data.hasDependencies();
    }

    public boolean hasAnyDependencyLoaded(){

        for(Dependency d : data.getDependencies()){
            if(Degree.getDegree().hasExam(d.getDependency()) && hasDependencyLoaded(Degree.getDegree().getExam(d.getDependency()))){
                return true;
            }
        }
        return false;
    }

    public boolean hasDependencyLoaded(Exam e){
        return hasDependency(e)
                && (hasStrictDependencyLoaded(e)
                || hasSoftDependencyLoaded(e));
    }

    public boolean hasSoftDependencyLoaded(Exam e){
        if(data == null)
            return false;
        if(!data.hasSoftDependencies(e.getName()))
            return false;

        for(ExamDependency d : data.getDependency(e.getName()).getSoft_dependencies()){
            if(Degree.getDegree().hasExam(d.getExam())) {
                return true;
            }
        }
        return false;
    }

    public boolean hasStrictDependencyLoaded(Exam e){
        if(data == null)
            return false;
        if(!data.hasStrictDependencies(e.getName()))
            return false;

        for(ExamDependency d : data.getDependency(e.getName()).getStrict_dependencies()){
            if(Degree.getDegree().hasExam(d.getExam())) {
                return true;
            }
        }
        return false;
    }

    public List<Exam> getExamsWithDependencies(){
        List<Exam> list = new ArrayList<Exam>();
        for(Dependency d : data.getDependencies()){
            if(Degree.getDegree().hasExam(d.getDependency()) && hasDependencyLoaded(Degree.getDegree().getExam(d.getDependency()))){
                list.add(Degree.getDegree().getExam(d.getDependency()));
            }
        }
        return list;
    }

    public List<Exam> loadSoftDependencies(Exam e){
        List<Exam> list = new ArrayList<Exam>();
        if(hasStrictDependencyLoaded(e))
            return list;
        for(ExamDependency d : data.getDependency(e.getName()).getSoft_dependencies()){
            if(Degree.getDegree().hasExam(d.getExam())) {
                list.add(Degree.getDegree().getExam(d.getExam()));
            }
        }
        return list;
    }


    public List<Exam> loadStrictDependencies(Exam e){
        List<Exam> list = new ArrayList<Exam>();
        if(hasSoftDependencyLoaded(e))
            return list;

        for(ExamDependency d : data.getDependency(e.getName()).getStrict_dependencies()){
            if(Degree.getDegree().hasExam(d.getExam())) {
                list.add(Degree.getDegree().getExam(d.getExam()));
            }
        }
        return list;
    }



}
