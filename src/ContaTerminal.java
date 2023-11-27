import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {

        String nomeCliente;
        String agencia;
        int numero;
        double saldo;

        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor, digite o seu nome!");
        nomeCliente = sc.next();
        System.out.println("Por favor, digite o número da Agência!");
        agencia = sc.next();
        System.out.println("Por favor, digite o número da conta!");
        numero = sc.nextInt();
        saldo = 50.0;
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque", nomeCliente, agencia, numero, saldo);

        sc.close();
    }

}
