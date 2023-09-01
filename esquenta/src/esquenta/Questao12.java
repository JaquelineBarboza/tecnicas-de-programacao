package esquenta;
import java.util.Scanner;
public class Questao12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um número A:");
		int A = entrada.nextInt();
		System.out.println("Digite um número B:");
		int B = entrada.nextInt();
		
		if(A>10) {
			System.out.println("A>10");}
		else if(A+B==20) {
			System.out.println("A+B==20");}
		else {
			System.out.println("números não válidos");}
		
		System.out.println("SEJAM BEM-VINDOS A DISCIPLINA DE TECNICAS DE PROGRAMAÇÃO");
		entrada.close();
		
		
	}

}
