package model.yaml;

import java.util.List;

/**
 * Oggetto collezionato nel <i>DependencyMapper</i>. Definisce le dipendenze verso un certo esame, denotato come <tt>dependency</tt>:
 * <ul>
 *     <li><i>dipendenze soft</i>: lista di <i>ExamDependency</i> che definiscono gli esami suggeriti prima di affrontare la <tt>dependency</tt>;</li>
 *     <li><i>dipendenze strict</i>: lista di <i>ExamDependency</i> che definiscono gli obblighi formativi propedeutici per la <tt>dependency</tt>;</li>
 * </ul>
 * Sebbene il termine <tt>dependency</tt> può essere ambiguo, la definizione di <tt>dependency</tt> vorrebbe indicare un esame che ha delle precedenze da assolvere, dai quali quindi dipende.
 * <br>La struttura può essere estratta da file YAML e segue la gerarchia di attributi. Le dipendenze sono definite tramite la classe {@link ExamDependency} opportunamente codificati: <br><br>
 *  &nbsp;&nbsp;- <tt>dependency</tt>: "valore stringa"<br>
 *  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&#9500;&#9472;<i>description</i>: "valore stringa" (opzionale)<br>
 *  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&#9500;&#9472;<i>soft_dependencies</i>: (opzionale)<br>
 *  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&#9500;&#9472;<i>{@link ExamDependency}</i><br>
 *  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&#9492;&#9472; <tt> ... </tt><br>
 *  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&#9492;&#9472;<i>strict_dependencies</i>: (opzionale)<br>
 *  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&#9500;&#9472;<i>{@link ExamDependency}</i><br>
 *  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&#9492;&#9472; <tt> ... </tt><br>
 */
public class Dependency {
	private String dependency;
	private String description;
	private List<ExamDependency> soft_dependencies;//è stato utilizzato lo snake_case per compatibilità con keywords in yaml
    private List<ExamDependency> strict_dependencies;//è stato utilizzato lo snake_case per compatibilità con keywords in yaml

	/**
	 * Ritorna il nome dell'esame con dipendenze.
	 * @return nome dell'esame <i>String</i>
	 */
	public String getDependency() {
		return dependency;
	}

	/**
	 * Serve a SnakeYAML
	 * @param dependency
	 */
	public void setDependency(String dependency){this.dependency=dependency;}

	/**
	 * Ritorna una descrizione della <i>Dependency</i> (ad es. il motivo per cui è stata formalizzata la dipendenza tra <tt>dependency</tt> e le dipendenze <i>strict</i>/<i>soft</i>)
	 * @return descrizione <i>String</i>
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * Serve a SnakeYAML
	 * @param description
	 */
	public void setDescription(String description){
		this.description=description;
	}


	/**
	 * Restituisce la lista di dipendenze <tt>soft</tt>, definite come <i>ExamDependency</i>
	 * @return <i>List</i> di elementi <i>ExamDependency</i>
	 */
	public List<ExamDependency> getSoft_dependencies() {
		return soft_dependencies;
	}


	/**
	 * serve a SnakeYAML
	 * @param soft_dependencies
	 */
	public void setSoft_dependencies(List<ExamDependency> soft_dependencies) {
		this.soft_dependencies = soft_dependencies;
	}


	/**
	 * Restituisce la lista di dipendenze <tt>strict</tt>, definite come <i>ExamDependency</i>
	 * @return <i>List</i> di elementi <i>ExamDependency</i>
	 */
	public List<ExamDependency> getStrict_dependencies() {
		return strict_dependencies;
	}


	/**
	 * serve a SnakeYAML
	 * @param strict_dependencies
	 */
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
