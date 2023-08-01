import java.util.Scanner;
/*
 * 
 * @sysoutLIPE
 * 
 */
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, digite o seu nome!");
        String nomeCliente = sc.nextLine();

        System.out.println("Por favor, digite o número da agência!");
        String numeroAgencia = sc.nextLine();

        System.out.println("Por favor, digite o número da conta!");
        int numeroDaConta = sc.nextInt();

        System.out.println("Por favor, digite a quantidade do seu saldo!");
        double quantidadeDoSaldo = sc.nextDouble();


        System.out.printf("Olá " + nomeCliente + ", obrigado por criar uma conta em " +
        "nosso banco, sua agência é " + numeroAgencia + ", conta " + numeroDaConta + 
        " e seu saldo = %.2f", quantidadeDoSaldo , " já está disponível para saque.");

        sc.close();

    }
}
