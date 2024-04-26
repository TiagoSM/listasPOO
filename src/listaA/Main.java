package listaA;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Qual exercício você deseja fazer?");
		byte opt = scanner.nextByte();
		Exercicios exercise = new Exercicios(opt);
		exercise.execute();
		scanner.close();
	}

}
