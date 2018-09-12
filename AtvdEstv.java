
import java.util.Scanner;


public class AtvdEstv {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double saldo = 0;
        AtvdEstv obj = new AtvdEstv();
        while(true){
            obj.menu();
            int option = tcl.nextInt();
        switch(option){
            case 1:
                obj.depo(saldo);
                break;
            case 2:
                obj.sacar(saldo);
                break;
            case 3:
                obj.saldo(saldo);
                break;
            case 4:
                obj.sair();
        }
       }
    }
public void menu(){
    System.out.println("-___MENU___-");
    System.out.println("");
    System.out.println("1 - DEPOSITAR");
    System.out.println("2 - SACAR");
    System.out.println("3 - VER SALDO");
    System.out.println("4 - SAIR");
    System.out.println("");
    System.out.println("Escolha uma opção.");
}
public void depo(double saldo) {
    Scanner tcl = new Scanner(System.in);
    System.out.println("Digite um valor:");
    double valor = tcl.nextInt();
    System.out.println("Obrigado!");
    saldo = saldo + valor;
    System.out.println("Seu saldo agora é" + saldo);
    return;
}
public void sacar(double saldo){
    Scanner tcl = new Scanner(System.in);
    System.out.println("Digite um valor:");
    double valor = tcl.nextInt();
    System.out.println("Obrigado!");
    saldo = saldo - valor;
    System.out.println("Seu saldo agora é" + saldo);
    return;
}
public void saldo(double saldo){
    System.out.println("Seu saldo é" + saldo);
}
public void sair(){
    System.out.println("Obrigado!");
    System.out.println("Volte sempre!");
    System.exit(0);
}
    
}
