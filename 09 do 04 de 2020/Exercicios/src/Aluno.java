public class Aluno extends SerHumano {
	
	protected String nome;
    private Smartphone celular;

    public Aluno(String nome, String cor_dos_olhos, double altura, double peso, String locomove, Smartphone celular) {
        super(cor_dos_olhos, altura, peso, locomove);
        this.nome = nome;
        this.celular = celular;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
    	this.nome = nome;
    }
    
    public Smartphone getCelular() {
        return celular;
    }

    public void setCelular(Smartphone celular) {
        this.celular = celular;
    }
}
