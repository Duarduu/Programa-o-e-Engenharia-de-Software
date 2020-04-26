package exerciciosPes;

public class Professor extends SerHumano {

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getDisciplina() {
		return disciplina;
	}
	
	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}
	
	private String nome, disciplina;
	Smartphone smrt = new Smartphone();
	
	public Professor(String nome, String disciplina) {
		super();
	}

}
