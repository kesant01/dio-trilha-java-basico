import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Olá! \nPor favor, digite o número da conta: ");
        int numero = scanner.nextInt();

        System.out.println("Digite a sua agência: ");
        String agencia = scanner.next();

        System.out.println("Digite o seu primeiro nome: ");
        String nomeCliente = scanner.next();

        System.out.println("Digite o valor do saldo a ser depositado: ");
        Double saldo = scanner.nextDouble();


        System.out.println("Olá " + nomeCliente + "! \nObrigado por criar uma conta em nosso banco. " +
                "\nSua agência é " + agencia + ", sua conta é " + numero + " e" +
                "\nseu saldo de R$" + saldo + " já está disponível para saque." );
    }
}