import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        String nomeCliente;
        String agencia;
        int numeroConta;
        double saldo;

        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, digite o nome do cliente!");
        nomeCliente = sc.nextLine();

        System.out.println("Por favor, digite a agência!");
        agencia = sc.nextLine();

        System.out.println("Por favor, digite o número da conta!");
        numeroConta = sc.nextInt();

        System.out.println("Por favor, digite o saldo!");
        saldo = sc.nextDouble();

        System.out.println("Olá "+ nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + ", conta " + numeroConta + " e seu saldo " + saldo+ " já está disponível para saque.");



    }
}