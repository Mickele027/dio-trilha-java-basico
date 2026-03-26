import java.util.InputMismatchException;
import java.util.Scanner;

public class ContaTerminal {
    /**
     * Método principal que solicita ao usuário inserir dados da sua conta no banco.
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        int numero;
        String agencia;
        String cliente;
        float saldo;

        try {
            System.out.println("Seja Bem vindo ao Banco Souzus!");
            System.out.println("Digite o número da Agência! (APENAS NÚMEROS)");
            Scanner s = new Scanner(System.in);
            numero = s.nextInt();

            System.out.println("Digite o código da Agência! (APENAS NUMEROS! SEPARAR O ÚLTIMO DÍGITO COM O -");
            agencia = s.next();

            System.out.println("Digite o SEU nome:(APENAS LETRAS)");
            cliente = s.next();
            cliente = cliente.toUpperCase();

            System.out.println("Digite o saldo da TUA conta:(APENAS NÚMEROS)");
            saldo = s.nextFloat();
            System.out.println();
            System.out.printf("Olá %d, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo %.2f já está disponível para saque", numero,agencia,cliente,saldo);
        } catch (InputMismatchException e) {
            System.err.println("Não é permitido inserir o que NÃO FOI ESPECIFICADO!");
        }
    }
}
