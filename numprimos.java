public class numprimos{
	public static void main(String[] args) {
		Scanner tcl =new Scanner(System.in);
		System.out.print("Escolha um número:");
		num = tcl.nextInt();
		if (num/2) {
			if (num/3) {
				if (num/5) {
					if(num/7){
						if (num/11) {
							System.out.print("Não. Ele não é primo.");
						}
					}
					
				}
				
			}
			
		}else{
			System.out.print("Sim. Ele é primo");
		}
	}
}