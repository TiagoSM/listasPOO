package listaA;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Qual exercício você deseja fazer?");
		int opt = scanner.nextInt();
		Exercicios exercise = new Exercicios(opt);
		exercise.execute();
		scanner.close();
	}

}
