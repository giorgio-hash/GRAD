package myPackage.YAMLutils;

import java.util.List;

public class DependencyManager {

	private List<Dependency> dependencies;


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
