package esquenta;
import java.util.Scanner;
public class Questao20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um número A:");
		int A = entrada.nextInt();
		System.out.println("Digite um número B:");
		int B = entrada.nextInt();
		
		if(A>10||A+B==20) {
			System.out.println("números válidos");
		}
		else {
			System.out.println("número não válido");
		}
			System.out.println("SEJAM BEM-VINDOS Á DISCIPLINA DE TÉCNICAS DE PROGRAMAÇÃO");
			
			entrada.close();
	}

}
