package listaA;

import java.util.Scanner;

public class Exercicios {
	private byte exerciseNumber;
	
	public Exercicios (byte exercise){
		this.exerciseNumber = exercise;
	}


	public void execute() {
		Scanner scanner = new Scanner(System.in);
		byte flag = 0;
		switch(this.exerciseNumber) {
			case 1:
				long guns;
				do {
					System.out.print("Quantas armas o soldado está segurando: ");
					guns = scanner.nextLong();
					if(guns <= 0) {
						flag = 1;
					} else {
						flag = 0;
					}
				} while(flag == 1);
				this.exercise1(guns);
				break;
			case 2:
				int n;
				do {
					System.out.println("Digite um número em inteiro para que seja somado o seu primeiro e último dígito: ");
					n = scanner.nextInt();
					if(n < 10){
						flag = 1;
					} else {
						flag = 0;
					}
				}while(flag == 1);
				this.exercise2(n);
				break;		
			default:
				System.out.println("Digite um número de 1 a 4!");
			}
			scanner.close();	
		}
	
	private void exercise1 (long guns){
		if(guns % 2 == 0) {
			System.out.println("Sortudo!");
		} else {
			System.out.println("Azarado!");
		}
	}
	
	private void exercise2 (int n) {
		String number = Integer.toString(n);
		int result = Character.getNumericValue(number.charAt(0)) + Character.getNumericValue(number.charAt(number.length() - 1));
		System.out.println("Resultado: " + result);
	}
}
