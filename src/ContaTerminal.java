import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        // Váriaveis
        int accountNumber;
        String agencyNumber, firstName, secondName, digit;
        double bankBalance;

        // Iniciando 
        System.out.println("Criando conta báncaria");
        System.out.println("=========================================================");

        // Entradas do Usuário

        // Nome
        System.out.print("Nome -->  ");
        firstName = scanner.next();

        // Sobrenome
        System.out.print("Sobrenome --> ");
        secondName = scanner.next();

        // Numero
        System.out.println("ATENÇÃO! NÚMERO DA CONTA DEVE CONTER 4 DIGITOS.");
        System.out.print("Numero da conta --> ");
        accountNumber = scanner.nextInt();

        // Agência
        System.err.print("Agência --> ");
        agencyNumber = scanner.next();
        System.out.print("Digito --> ");
        digit = scanner.next();

        // Saldo
        System.out.print("Saldo --> ");
        bankBalance = scanner.nextDouble();

        // Retorno ao usuário

        System.out.println("=========================================================");
        System.out.println("Conta criada!" + " " + firstName);
        System.out.println("=========================================================");
        System.out.println("Titular da conta --> " + firstName + " " + secondName);
        System.out.println("Numero da conta --> " + accountNumber);
        System.out.println("Agência --> " + accountNumber + "-" + digit);
        System.out.println("Saldo --> " + bankBalance + "R$");
        System.out.print("=========================================================");
    }
}
