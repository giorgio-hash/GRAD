package myPackage.YAMLutils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DependencyManager {

	private List<Dependency> dependencies;
	private Map<String,Dependency> dependencies_map;


	public void mapDependencies(){
		dependencies_map = new HashMap<String,Dependency>();
		for(Dependency d : dependencies){
			dependencies_map.put(d.getDependency(),d);
		}
	}

	public Dependency getDependency(String exam){
        return dependencies_map.getOrDefault(exam, null);
	}

	public boolean hasDependencies(){
		return dependencies.isEmpty();
	}

	public List<Dependency> getDependencies() {
		return dependencies;
	}


	public void setDependencies(List<Dependency> dependencies) {
		this.dependencies = dependencies;
	}


	@Override
	public String toString() {
		
		String s = "DependencyManager [dependencies=\n";
		for (Dependency dependency : dependencies) {
			s += "\t"+dependency+",\n";
		}
		
		return  s + "]";
	}
	
	
}
