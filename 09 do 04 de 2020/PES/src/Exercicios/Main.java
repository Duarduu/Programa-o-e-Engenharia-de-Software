package Exercicios;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String usuario, senha;
		Scanner a = new Scanner(System.in);

		System.out.println("Digite um user:");
		usuario = a.nextLine();

		System.out.println("Digite uma senha:");
		senha = a.nextLine();

		while (usuario.equalsIgnoreCase(senha)) {
			System.err.println("O user não pode ser igual a senha, tente novamente.");

			System.out.println("Digite um user:");
			usuario = a.nextLine();

			System.out.println("Digite uma senha:");
			senha = a.nextLine();
		}
		System.out.println("Cadastrado efetuado com sucesso.");

	}
}
