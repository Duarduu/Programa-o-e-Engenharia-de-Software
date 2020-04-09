package pacoteSmartphone;

public class Aluno extends SerHumano{
	
	private String nome;
	
	Smartphone smrt = new Smartphone();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Aluno(String nome) {
		this.nome = nome;
	}
	
	public String locomover_rapido() {
		return "Automóvel";
	}
	

}
