import java.util.scanner;

public class troco{
	public static void main(String[] args) {
		Scanner tcl = new Scanner(System.in);
		System.out.print("Qual o preço do produto?");
		double preco = tcl.nextInt();
		System.out.print("Quanto o cliente deu?");
		double dado = tcl.nextInt();
		double troco = dado - preco;

		if (dado > preco) {
			obj.troco(double troco);
		}else{
			System.out.print("O cliente não recebe nada.")
		}
	}

	public void troco(double troco){
		if( troco > 1){
			System.out.print("O cliente deverá receber" + troco + "reais")
		}
		if (troco<1) {
			System.out.print("O cliente deverá receber" + troco + "centavos")
		}
	} 
}
