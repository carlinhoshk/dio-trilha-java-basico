import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);


        System.out.println("Por favor, digite o número da Agência: ");
        numero = sc.nextInt();
        sc.nextLine();  // Consumir a linha restante

        System.out.println("Por favor, digite o número da sua Conta: ");
        agencia = sc.nextLine();

        System.out.println("Por favor, digite o seu Nome: ");
        nomeCliente = sc.nextLine();

        System.out.println("Por favor, digite seu Saldo: ");
        sc.hasNextDouble();
        saldo = sc.nextDouble();
        sc.nextLine();  // Consumir a linha restante



        String mensagem = "Olá ".concat(nomeCliente)
                .concat(", obrigado por criar uma conta em nosso banco. Sua agência é ")
                .concat(agencia)
                .concat(", conta número ")
                .concat(String.valueOf(numero))
                .concat(", e seu saldo de R$ ")
                .concat(String.valueOf(saldo))
                .concat(" já está disponível para saque.");


        System.out.println(mensagem);
    }
}
