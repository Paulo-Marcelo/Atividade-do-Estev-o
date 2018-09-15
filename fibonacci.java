import java.util.Scanner;

public class finonacci{
	public static void main(String[] args) {
		Scanner tcl = new Scanner(System.in);
		System.out.print("Escolha o valor da posição.")
		int posi = tcl.nextInt();
		int fibo1 =0;
		int fibo2= 1;
		int aux;

		for (i = 0;i < posi ;i++ ) {
			aux = fibo2;
			fibo2 = fibo1 + fibo2;
			fibo1 = aux;

			System.out.print(fibo);
		}
	}	
}