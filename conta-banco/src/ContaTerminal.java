import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        System.out.println("Olá, seja muito bem-vindo ao seu banco. Insira o que está sendo pedido abaixo: ");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o número da sua conta: ");
          int num = scanner.nextInt();
          scanner.nextLine();

        System.out.println("Insira o número da sua agencia: ");
           String numAgencia = scanner.nextLine();

        System.out.println("Insira o seu nome: ");
           String name = scanner.nextLine();

        System.out.println("Insira o seu saldo: ");   
             double saldo = scanner.nextDouble();

        System.out.printf("Sr(a) %s da agencia %s e da conta %s o seu saldo atualizado e pronto para saque é de: %s \n", name, numAgencia, num, saldo);     
    }
}
