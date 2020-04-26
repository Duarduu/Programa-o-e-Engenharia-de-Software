public class Vendedor extends Funcionario {
    private String tipo;
    private int qtd_venda;
    private Vendedor gerente;

    public Vendedor() {

    }

    public Vendedor(String nome, String cpf, String telefone, int idade, String setor, String nome_cargo,
                    double salario, String tipo, int qtd_venda, Vendedor gerente) {
        super(nome, cpf, telefone, idade, setor, nome_cargo, salario);
        this.tipo = tipo;
        this.qtd_venda = qtd_venda;
        this.gerente = gerente;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getQtd_venda() {
        return qtd_venda;
    }

    public void setQtd_venda(int qtd_venda) {
        this.qtd_venda = qtd_venda;
    }

    public Vendedor getGerente() {
        return gerente;
    }

    public void setGerente(Vendedor gerente) {
        this.gerente = gerente;
    }

}