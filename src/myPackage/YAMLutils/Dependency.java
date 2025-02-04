package myPackage.YAMLutils;

import java.util.List;

public class Dependency {
	private String dependency;
	private String description;
	private List<ExamDependency> soft_dependencies;
    private List<ExamDependency> strict_dependencies;
    
    

	public String getDependency() {
		return dependency;
	}



	public void setDependency(String dependency) {
		this.dependency = dependency;
	}



	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}



	public List<ExamDependency> getSoft_dependencies() {
		return soft_dependencies;
	}



	public void setSoft_dependencies(List<ExamDependency> soft_dependencies) {
		this.soft_dependencies = soft_dependencies;
	}



	public List<ExamDependency> getStrict_dependencies() {
		return strict_dependencies;
	}



	public void setStrict_dependencies(List<ExamDependency> strict_dependencies) {
		this.strict_dependencies = strict_dependencies;
	}



	@Override
	public String toString() {
		String s = "Dependency [dependency=" + dependency + ", soft_dependencies=\n";
		if(soft_dependencies != null)
		for(ExamDependency e : soft_dependencies)
			s += "\t"+e+";\n";
		s += ", strict_dependencies=\n";
		if(strict_dependencies != null)
		for(ExamDependency e : strict_dependencies)
			s += "\t"+e+";\n";
		return  s + "]";
	}
}
