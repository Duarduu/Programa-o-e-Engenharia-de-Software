public class Gerente extends Funcionario {

    private String tipo;

    public Gerente(String tipo) {
        this.tipo = tipo;
    }

    public Gerente(String nome, String cpf, String telefone, int idade, String setor, String nome_cargo,
                   double salario, String tipo) {
        super(nome, cpf, telefone, idade, setor, nome_cargo, salario);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }


}