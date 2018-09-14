
import java.util.Scanner;

public class troco{
	public static void main(String[]args){
		Scanner tcl = new Scanner(Systcem.in);
		double preco = tcl.nextInt();
		double dado = tcl.nextInt();
		double troco = 0;
		
		if(preco<dado){
			troco= dado - preco;c
			System.out.print("O cliente deve receber R$" + troco);
			System.out.print ("Obrigado pela compra ;)");
			System.out.print ("Volte sempre");
		}else{
			System.out.print("Obrigado pela compra :)");
			System.out.print ("Volte sempre");
		}
	}
}
