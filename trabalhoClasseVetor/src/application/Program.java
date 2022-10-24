package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;
import entities.Vetor;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		int option;
		
		System.out.print("Informe quantos estudantes possui na classe: ");
		int n = sc.nextInt();
		Vetor room = new Vetor(n);
		do {
			System.out.println("Escolha uma das opcoes: ");
			System.out.println("1 - inserir um estudante;");
			System.out.println("2 - retirar um estudante;");
			System.out.println("3 - buscar um estudante;");
			System.out.println("4 - lista de todos os estudantes;");
			System.out.println("9 - sair.");
			option = sc.nextInt();
			
			switch(option) {
				case 1:
					System.out.print("Informe o nome do estudante: ");
					sc.nextLine();
					String name = sc.nextLine();
					System.out.print("Informe a idade do estudante: ");
					int age = sc.nextInt();
					room.insert(new Student(name, age));
					break;
				case 2:
					System.out.print("Informe a posicao do estudante que deseja retirar do vetor: ");
					int position = sc.nextInt();
					room.remove(position);
					break;
				case 3:
					System.out.print("Informe a posicao do estudante que deseja buscar no vetor: ");
					position = sc.nextInt();
					System.out.println(room.findElement(position));
					break;
				case 4:
					room.showArray();
					break;
				case 9:
					System.out.println("Programa encerrado!");
					break;
				default:
					System.out.println("Opcao invalida! Informe um numero correspondete a uma das opcoes.");
			}
		}while(option != 9);
		
				
		
		
		sc.close();
	}

}
