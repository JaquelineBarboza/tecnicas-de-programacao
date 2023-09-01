package esquenta;

import java.util.Scanner;
public class Questao16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um número A:");
		int A = entrada.nextInt();
		System.out.println("Digite um número B:");
		int B = entrada.nextInt();
		
		
		if(A==10) {
			System.out.println("A == 10");
		}
		if(A+B==20) {
			System.out.println("A + B == 20");
		}
		if(B==10) {
			System.out.println("B == 10");
		}
		entrada.close();
	}

}
