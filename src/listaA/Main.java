package listaA;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		byte flag = 0;
		byte opt;
		do {
			System.out.println("Qual exercício você deseja fazer?");
			opt = scanner.nextByte();
			if(opt < 1 || opt > 4) {
				System.out.println("Digite um número inteiro de 1 a 4!");
				flag = 1;
			} else {
				flag = 0;
			}
		} while(flag == 1);
		Exercicios exercise = new Exercicios(opt);
		exercise.execute();
		scanner.close();
	}
}
