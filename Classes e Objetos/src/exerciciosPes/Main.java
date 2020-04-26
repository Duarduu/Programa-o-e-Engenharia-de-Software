package exerciciosPes;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
	
	public static void main(String[] args) {
		
		List<String> alunos = new ArrayList<>();
		
		
		alunos.add("Pedro");
		alunos.add("João");
		alunos.add("Jackson");
		alunos.add("Vitor");
		alunos.add("Victor");
		alunos.add("Mateus");
		alunos.add("Matheus");
		alunos.add("Laura");
		alunos.add("Taynara");
		alunos.add("Cecilia");
		alunos.add("Ezekel");
		alunos.add("Lucas");
		alunos.add("Gisele");
		alunos.add("Ana");
		alunos.add("Carlos");
		alunos.add("Eduardo");
		alunos.add("Filipe");
		alunos.add("Renato");
		alunos.add("Renata");
		alunos.add("Davi");
		alunos.add("Maria");
		alunos.add("Gustavo");
		alunos.add("Daniel");
		alunos.add("Emanuel");
		alunos.add("Diogo");
		alunos.add("Diego");
		alunos.add("Erick");
		alunos.add("Heriqui");
		alunos.add("Herick");
		alunos.add("Jhonatan");
		
		
		List<String> cores = new ArrayList<>();

		cores.add("Castanho");
		cores.add("Azul");
		cores.add("Verde");
		cores.add("Caramelado");
		cores.add("Ciano");
		cores.add("Esmeralda");
		
		int contador = 0;
		for(String s : alunos) {
			Random rand = new Random();
			contador++;
			
			int i = (int) (Math.random() * cores.size());
			
			Aluno aluno = new Aluno(s);
			aluno.setAltura(rand.nextInt(90)+100);
			aluno.setCorOlhos("Branco");
			aluno.setPeso(rand.nextInt(80)+40);
			System.out.println("Aluno número: "+contador);
			System.out.println("Nome do aluno: "+aluno.getNome());
			System.out.println("Cor dos olhos: "+ cores.get(i));
			System.out.println("Peso em KG: "+aluno.getPeso());
			System.out.println("Altura em CM: "+aluno.getAltura());
			if(contador == (int) (Math.random() * alunos.size())) {
				System.out.println("Locomove: " + aluno.locomover_rapido()+ " \n\n");
			}else {
				System.out.println("Locomove: " + aluno.locomover_lento() + " \n\n");
			}
			
		}
		
		
		
		
		
	}
}
