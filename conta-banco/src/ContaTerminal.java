import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Bom dia! informe seu nome cadastrado: ");
        String nomeCliente = sc.next();

        System.out.println("Me informe o número da conta! ");
        int numeroConta = sc.nextInt();

        System.out.println("Por favor, me informe o número da agência!");
        String numeroAgencia = sc.next();

        double saldo = 237.48;

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + numeroAgencia + ", conta " + numeroConta + " e seu Saldo " + saldo + " já está disponivel para saque." );
    
    }
}
