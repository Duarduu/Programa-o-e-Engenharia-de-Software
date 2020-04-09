

public class Main {

    public static void main(String[] args) {

        Professor p = new Professor("João", "Castanho", 1.7, 80.00, "Rapido", new Smartphone(), "Logica de programação");
        Aluno[] alunos = new Aluno[30];
        alunos[0] = new Aluno("Ana", "Azul", 1.65, 55,"Rapido", new Smartphone());
        alunos[1] = new Aluno("Paulo", "Verde", 1.68, 65, "Lento",new Smartphone());
        alunos[2] = new Aluno("Gustavo", "Castanho", 1.78, 75, "Lento",new Smartphone());
        alunos[3] = new Aluno("Maria", "Azul", 1.68, 60,"Lento", new Smartphone());
        alunos[4] = new Aluno("Pedro", "Castanho", 1.68, 60,"Lento", new Smartphone());
        alunos[5] = new Aluno("Mariana", "Azul", 1.78, 60,"Lento", new Smartphone());
        alunos[6] = new Aluno("Filipe", "Castanho", 1.88, 60,"Rapido", new Smartphone());
        alunos[7] = new Aluno("Felipe", "Azul", 1.78, 60,"Lento", new Smartphone());
        alunos[8] = new Aluno("Eudardo", "Verde", 1.65, 52, "Lento",new Smartphone());
        alunos[9] = new Aluno("Eduarda", "Azul", 1.66, 60,"Lento", new Smartphone());
        alunos[10] = new Aluno("Vicente", "Castanho", 1.63, 60, "Lento",new Smartphone());
        alunos[11] = new Aluno("João", "Azul", 1.68, 60,"Lento", new Smartphone());
        alunos[12] = new Aluno("Lucas", "Castanho", 1.68, 60,"Rapido", new Smartphone());
        alunos[13] = new Aluno("Fabio", "Castanho", 1.68, 70, "Lento",new Smartphone());
        alunos[14] = new Aluno("Luciano", "Verde", 1.68, 65,"Rapido", new Smartphone());
        alunos[15] = new Aluno("Cecilia", "Castanho", 1.64, 60,"Rapido", new Smartphone());
        alunos[16] = new Aluno("Taynara", "Castanho", 1.68, 45,"Rapido", new Smartphone());
        alunos[17] = new Aluno("Alisson", "Castanho", 1.66, 60, "Lento",new Smartphone());
        alunos[18] = new Aluno("Enzo", "Azul", 1.65, 55, "Lento",new Smartphone());
        alunos[19] = new Aluno("Isadora", "Verde", 1.68, 65, "Lento",new Smartphone());
        alunos[20] = new Aluno("Gisele", "Castanho", 1.78, 75,"Lento", new Smartphone());
        alunos[21] = new Aluno("Rafaela", "Castanho", 1.68, 56,"Lento", new Smartphone());
        alunos[22] = new Aluno("Rafael", "Castanho", 1.68, 60,"Lento", new Smartphone());
        alunos[23] = new Aluno("Kauan", "Verde", 1.68, 60,"Lento", new Smartphone());
        alunos[24] = new Aluno("Kauê", "Castanho", 1.68, 60,"Rapido", new Smartphone());
        alunos[25] = new Aluno("Mauricio", "Castanho", 1.68, 60,"Lento", new Smartphone());
        alunos[26] = new Aluno("Claudete", "Azul", 1.78, 60,"Rapido", new Smartphone());
        alunos[27] = new Aluno("Pedrinho", "Castanho", 1.72, 60,"Lento", new Smartphone());
        alunos[28] = new Aluno("Pedro", "Azul", 1.68, 60,"Lento", new Smartphone());
        alunos[29] = new Aluno("Ezekel", "Verde", 1.69, 60,"Rapido", new Smartphone());
        

        Sala s = new Sala(alunos);
        int contador = 0;
        for (int x = 0; x < 30; x++) {
			contador++;
			

			System.out.println("Aluno número:  "+contador);
			System.out.println("Nome do aluno:  "+alunos[x].getNome());
			System.out.println("Cor dos olhos:  "+alunos[x].getCor_dos_olhos());
			System.out.println("Peso em KG:  "+alunos[x].getPeso());
			System.out.println("Altura em CM:  "+alunos[x].getAltura());
			System.out.println("Locomoção:  " + alunos[x].getLocomoção());
			System.out.println("------------------------------------");
		}
        
        
    }
}
