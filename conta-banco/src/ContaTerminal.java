import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        double saldo = 0.0;

        //TODO: Conhecer eimportar a classe Scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        //Exibir as mensagens para o nosso usuário
        //Obter pelo Scanner os valores digitados no terminal

        System.out.println("Digite o número da conta: ");
        int numero = scanner.nextInt();

        System.out.println("Digite o número da agencia: ");
        String agencia = scanner.next();

        System.out.println("Digite o nome do titular da conta: ");
        String nomeCliente = scanner.next();

        System.out.println("Faça seu primeiro deposito: ");
        double deposito = scanner.nextDouble();
        saldo = saldo + deposito;

        //Exibir a mensagem da conta criada
        System.out.println("Olá " + nomeCliente +", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +", conta " + numero + " e seu saldo R$" + saldo + " já está disponível para saque");
    }
}
