public class Cliente extends Pessoa {

    private String tipo;
    private String codigo;

    public Cliente(){
    }

    public Cliente(String nome, String cpf, String telefone, int idade, String tipo, String codigo) {
        super(nome, cpf, telefone, idade);
        this.tipo = tipo;
        this.codigo = codigo;
    }

    public String getTipo(){
        return tipo;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public String getCodigo(){
        return codigo;
    }

    public void setCodigo(String codigo){
        this.codigo = codigo;
    }

}
