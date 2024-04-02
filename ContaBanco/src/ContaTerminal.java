import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da Agência! ");
        int numero = sc.nextInt();

        sc.nextLine();

        System.out.println("Por favor, digite sua Agência: ");
        String agencia = sc.nextLine();

        System.out.println("Por favor, digite seu nome: ");
        String nome = sc.nextLine();

        System.out.println("Por favor, digite o seu saldo: ");
        double saldo = sc.nextDouble();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia
                + ", conta " + numero + " e seu saldo " + saldo + " já está dísponivel para saque.");
    }
}