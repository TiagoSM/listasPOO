package listaA;

import java.util.Scanner;

public class Exercicios {
	private int exerciseNumber;
	
	public Exercicios (int exercise){
		this.exerciseNumber = exercise;
	}


	public void execute() {
		Scanner scanner = new Scanner(System.in);
		switch(this.exerciseNumber) {
			case 1:
				int flag;
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
	
	
}
