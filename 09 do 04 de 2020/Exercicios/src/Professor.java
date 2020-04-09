public class Professor extends SerHumano {

	private String nome;
    private Smartphone celular;
    private String disciplina;

    public Professor(String nome, String cor_dos_olhos, double altura, double peso, String locomove, Smartphone celular, String disciplina) {
        super(cor_dos_olhos, altura, peso, locomove);
        this.celular = celular;
        this.disciplina = disciplina;
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

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }
}
