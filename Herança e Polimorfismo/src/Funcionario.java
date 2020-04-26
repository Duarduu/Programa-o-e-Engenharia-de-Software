public class Funcionario extends Pessoa {
    private String setor;
    private String nome_cargo;
    private double salario;

    public Funcionario() {

    }

    public Funcionario(String nome, String cpf, String telefone, int idade, String setor, String nome_cargo, double salario) {
        super(nome, cpf, telefone, idade);
        this.setor = setor;
        this.nome_cargo = nome_cargo;
        this.salario = salario;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public String getNomeCargo() {
        return nome_cargo;
    }

    public void setNomeCargo(String nome_cargo) {
        this.nome_cargo = nome_cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}