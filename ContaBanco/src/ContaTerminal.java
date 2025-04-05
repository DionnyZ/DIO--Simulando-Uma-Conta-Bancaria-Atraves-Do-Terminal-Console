import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Criação de conta no banco DioDin.");
        System.out.println("Informe seu nome:");
        String nome = scanner.nextLine();

        System.out.println("Informe o número da agência:");
        String agencia = scanner.nextLine();

        System.out.println("Informe o número da conta:");
        int numero = scanner.nextInt();

        System.out.println("Informe o saldo:");
        double saldo = scanner.nextDouble();

        //Exibir a mensagem da conta criada
        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");
    }
}
