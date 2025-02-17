package model.yaml;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DependencyMapper {

	private List<Dependency> dependencies;
	private Map<String,Dependency> dependenciesMap;


	public void mapDependencies(){
		dependenciesMap = new HashMap<String,Dependency>();
		for(Dependency d : dependencies){
			dependenciesMap.put(d.getDependency(),d);
		}
	}

	public Dependency getDependency(String exam){
        return dependenciesMap.getOrDefault(exam, null);
	}

	public boolean hasDependencies(){
		return !dependencies.isEmpty();
	}

	public boolean hasDependency(String exam){
		return dependenciesMap.containsKey(exam);
	}

	public boolean hasStrictDependencies(String exam){
		if(dependenciesMap.get(exam).getStrict_dependencies() == null)
			return false;
		return !dependenciesMap.get(exam).getStrict_dependencies().isEmpty();
	}

	public boolean hasSoftDependencies(String exam){
		if(dependenciesMap.get(exam).getSoft_dependencies() == null)
			return false;
		return !dependenciesMap.get(exam).getSoft_dependencies().isEmpty();
	}

	public List<Dependency> getDependencies() {
		return dependencies;
	}


	public void setDependencies(List<Dependency> dependencies) {
		this.dependencies = dependencies;
	}


	@Override
	public String toString() {
		
		String s = "DependencyMapper [dependencies=\n";
		for (Dependency dependency : dependencies) {
			s += "\t"+dependency+",\n";
		}
		
		return  s + "]";
	}
	
	
}
