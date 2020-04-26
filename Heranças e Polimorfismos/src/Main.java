
public class Main {
    public static void main(String[] args) {
/*

Setando os dados
(Criando os objetos e definindo suas propriedades)


 */
        Pessoa primeiraPessoa = new Pessoa();
        primeiraPessoa.setNome("Filipe");
        primeiraPessoa.setCpf("001.023.543-43");
        primeiraPessoa.setIdade(23);
        primeiraPessoa.setTelefone("55 68 4254-2843");

        Pessoa segundaPessoa = new Pessoa();
        segundaPessoa.setNome("Jaqueline");
        segundaPessoa.setCpf("058.002.543-32");
        segundaPessoa.setIdade(23);
        segundaPessoa.setTelefone("55 47 8958-5462");

        Cliente primeiroCliente = new Cliente();
        primeiroCliente.setNome("Joao");
        primeiroCliente.setTipo("Fisico");
        primeiroCliente.setCpf("015.685.478-25");
        primeiroCliente.setIdade(23);
        primeiroCliente.setTelefone("55 49 8425-2653");
        primeiroCliente.setCodigo("103");

        Cliente segundoCliente = new Cliente();
        segundoCliente.setNome("Gustavo");
        segundoCliente.setTipo("Virtual");
        segundoCliente.setCpf("095.665.875-52");
        segundoCliente.setIdade(23);
        segundoCliente.setTelefone("55 11 9158-6872");
        segundoCliente.setCodigo("103");

        Funcionario primeiroFuncionario = new Funcionario();
        primeiroFuncionario.setNome("Cecilia");
        primeiroFuncionario.setNomeCargo("Psicólogico");
        primeiroFuncionario.setSalario(2276);
        primeiroFuncionario.setSetor("RH");
        primeiroFuncionario.setCpf("419.422.030-71");
        primeiroFuncionario.setIdade(19);
        primeiroFuncionario.setTelefone("55 43 9987-4586");

        Funcionario segundoFuncionario = new Funcionario();
        segundoFuncionario.setNome("Taynara");
        segundoFuncionario.setNomeCargo("Coordenador");
        segundoFuncionario.setSalario(2330);
        segundoFuncionario.setSetor("Administrativo");
        segundoFuncionario.setCpf("445.163.230-79");
        segundoFuncionario.setIdade(32);
        segundoFuncionario.setTelefone("55 43 85471-4113");

        Gerente primeiroGerente = new Gerente("Comercial");
        primeiroGerente.setNome("Augusto");
        primeiroGerente.setSetor("Gestão Comercial");
        primeiroGerente.setNomeCargo("Gerente " + primeiroGerente.getTipo());
        primeiroGerente.setCpf("078.693.850-18");
        primeiroGerente.setIdade(25);
        primeiroGerente.setTelefone("55 47 8454-2584");


        Gerente segundoGerente = new Gerente("Marketing");
        segundoGerente.setNome("Vitoria");
        segundoGerente.setSetor("Vendas");
        segundoGerente.setNomeCargo("Gerente de " + segundoGerente.getTipo());
        segundoGerente.setCpf("079.234.542-54");
        segundoGerente.setIdade(42);
        segundoGerente.setTelefone("55 49 9954-2584");



        Vendedor primeiroVendedor = new Vendedor();
        primeiroVendedor.setNome("Douglas");
        primeiroVendedor.setIdade(25);
        primeiroVendedor.setSetor("Vendas");
        primeiroVendedor.setNomeCargo("Atendente");
        primeiroVendedor.setQtd_venda(790);
        primeiroVendedor.setTipo("Virtual");
        primeiroVendedor.setCpf("616.141.950-56");
        primeiroVendedor.setTelefone("55 53 8729-2865");


        Vendedor segundoVendedor = new Vendedor();
        segundoVendedor.setNome("José");
        segundoVendedor.setIdade(25);
        segundoVendedor.setSetor("Vendas");
        segundoVendedor.setNomeCargo("Atendente");
        segundoVendedor.setQtd_venda(1003);
        segundoVendedor.setTipo("Fisico");
        segundoVendedor.setCpf("427.197.470-68");
        segundoVendedor.setTelefone("55 8 8466-4286");

        double impostoVendedor = 1200 * 0.03;

        segundoVendedor.setSalario(impostoVendedor + (segundoVendedor.getQtd_venda()));
        segundoVendedor.setGerente(segundoVendedor);

        primeiroVendedor.setSalario(impostoVendedor  + (primeiroVendedor.getQtd_venda()));
        primeiroVendedor.setGerente(primeiroVendedor);

        double impostoGerente = 1200 * 0.05;

        double valorVendaMesGerente = (impostoGerente) * (23 + 25);
        primeiroGerente.setSalario(valorVendaMesGerente);

        double valorMarketingGerente = (impostoGerente) * (25 + 28);
        segundoGerente.setSalario(valorMarketingGerente);



    /*
        IMPRIMINDO OS CADASTROS
    */

        System.out.println("Pessoa :");
        System.out.println("   Nome: "+ primeiraPessoa.getNome()+"\n   Cpf: " + primeiraPessoa.getCpf()+ "\n   Idade: "  + primeiraPessoa.getIdade() +"\n   Telefone: " + primeiraPessoa.getTelefone()  + ".\n");

        System.out.println("Pessoa :");
        System.out.println("   Nome: "+ segundaPessoa.getNome()+"\n   Cpf: " + segundaPessoa.getCpf()+ "\n   Idade: "  + segundaPessoa.getIdade() +"\n   Telefone: " + segundaPessoa.getTelefone()  + ".\n");

        System.out.println("Cliente " + primeiroCliente.getTipo() + " : ");
        System.out.println("   Nome: "+ primeiroCliente.getNome()+"\n   Cpf: " + primeiroCliente.getCpf()+ "\n   Idade: "  + primeiroCliente.getIdade() +"\n   Telefone: " + primeiroCliente.getTelefone()  + "\n   Código: " + primeiroCliente.getCodigo() + "\n   Tipo: " + primeiroCliente.getTipo()+ ".\n");

        System.out.println("Cliente " + segundoCliente.getTipo() + " : ");
        System.out.println("   Nome: "+ segundoCliente.getNome()+"\n   Cpf: " + segundoCliente.getCpf()+ "\n   Idade: "  + segundoCliente.getIdade() +"\n   Telefone: " + segundoCliente.getTelefone()  + "\n   Código: " + segundoCliente.getCodigo() + "\n   Tipo: " + segundoCliente.getTipo()+ ".\n");


        System.out.println("Funcionario " + primeiroFuncionario.getSetor() + " : ");
        System.out.println("   Nome: "+ primeiroFuncionario.getNome()+"\n   Cpf: " + primeiroFuncionario.getCpf()+ "\n   Idade: "  + primeiroFuncionario.getIdade() +"\n   Telefone: " + primeiroFuncionario.getTelefone() + "\n   Setor: " + primeiroFuncionario.getSetor() + "\n   Cargo: " + primeiroFuncionario.getNomeCargo() + "\n   Sálario: " + primeiroFuncionario.getSalario()+ ".\n");

        System.out.println("Funcionario " + segundoFuncionario.getSetor() + " : ");
        System.out.println("   Nome: "+ segundoFuncionario.getNome()+"\n   Cpf: " + segundoFuncionario.getCpf()+ "\n   Idade: "  + segundoFuncionario.getIdade() +"\n   Telefone: " + segundoFuncionario.getTelefone() + "\n   Setor: " + segundoFuncionario.getSetor() + "\n   Cargo: " + segundoFuncionario.getNomeCargo() + "\n   Sálario: " + segundoFuncionario.getSalario()+ ".\n");

        System.out.println(" Vendedor " + primeiroVendedor.getTipo()+" : ");
        System.out.println("   Nome: " + primeiroVendedor.getNome() +"\n   Cpf: " + primeiroVendedor.getCpf()+ "\n   Idade: "  + primeiroVendedor.getIdade() +"\n   Telefone: " + primeiroVendedor.getTelefone() +  "\n   Setor: " + primeiroVendedor.getSetor() + "\n   Cargo: " + primeiroVendedor.getNomeCargo() + "\n   Sálario: " + primeiroVendedor.getSalario() + "\n   Quantidade de venda: " + primeiroVendedor.getQtd_venda() + "\n   Imposto: "+ impostoVendedor + ".\n");

        System.out.println(" Vendedor " + segundoVendedor.getTipo()+" : ");
        System.out.println("   Nome: " + segundoVendedor.getNome() +"\n   Cpf: " + segundoVendedor.getCpf()+ "\n   Idade: "  + segundoVendedor.getIdade() +"\n   Telefone: " + segundoVendedor.getTelefone() +  "\n   Setor: " + segundoVendedor.getSetor() + "\n   Cargo: " + segundoVendedor.getNomeCargo() + "\n   Sálario: " + segundoVendedor.getSalario() + "\n   Quantidade de venda: " + segundoVendedor.getQtd_venda() + "\n   Imposto: "+ impostoVendedor + ".\n");


        System.out.println(" Gerente " + primeiroGerente.getTipo() + " :");
        System.out.println("   Nome: " + primeiroGerente.getNome() +"\n   Cpf: " + primeiroGerente.getCpf()+ "\n   Idade: "  + primeiroGerente.getIdade() +"\n   Telefone: " + primeiroGerente.getTelefone() +"\n   Setor: " + primeiroGerente.getSetor() + "\n   Cargo: " + primeiroGerente.getNomeCargo() + "\n   Sálario: " + primeiroGerente.getSalario() + "\n   Imposto: "+ impostoGerente + ".\n");

        System.out.println(" Gerente " + segundoGerente.getTipo() + " :");
        System.out.println("   Nome: " + segundoGerente.getNome() +"\n   Cpf: " + segundoGerente.getCpf()+ "\n   Idade: "  + segundoGerente.getIdade() +"\n   Telefone: " + segundoGerente.getTelefone() +"\n   Setor: " + segundoGerente.getSetor() + "\n   Cargo: " + segundoGerente.getNomeCargo() + "\n   Sálario: " + segundoGerente.getSalario() + "\n   Imposto: "+ impostoGerente + ".\n");


    }
}