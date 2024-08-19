import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);

        // Váriaveis
        int accountNumber;
        String agencyNumber, firstName, secondName, digit;
        double bankBalance;

        // Iniciando 
        System.out.println("Criando conta báncaria");

        // Entradas do Usuário

        // Nome
        System.out.print("Nome -->  ");
        firstName = scanner.next();

        // Sobrenome
        System.out.print("Sobrenome --> ");
        secondName = scanner.next();

        // Numero
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
        
    }
}
