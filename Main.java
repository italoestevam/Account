package contaBancaria;
import java.util.Scanner;
public class Main {
    static void main() {
       Scanner sc = new Scanner(System.in);

        System.out.println("Qual o nome do titular ? ");
        String holder =sc.nextLine();
        System.out.println("Numero da conta: ");
        int accountNumber = sc.nextInt();
        System.out.println("Saldo atual:");
        double balance = sc.nextDouble();

        Account account = new Account(holder, accountNumber, balance);
        AccountService c = new AccountService();

        int option = 0;
        do {
            System.out.println(" 1_Deposit ");
            System.out.println(" 2_Withdraw");
            System.out.println(" 3_Check balance ");
            System.out.println(" 4_Exit");
            option =sc.nextInt();
            switch (option){
                case 1:
                    System.out.println("Quanto quer depositar ?");
                    double value = sc.nextDouble();
                    c.deposit(account, value);
                    System.out.println("Vc depositou R$"+value+".");
                    break;
                case 2:
                    System.out.println("Quanto vc quer sacar ?");
                    value = sc.nextDouble();
                    System.out.println("Vc sacou R$"+value+".");
                    c.withdraw(account, value);
                    break;
                case 3:
                    System.out.println("Saldo R$" + account.getBalance());
                    break;
                case 4:
                    System.out.println("Fim do porgrama.");
                    break;
                default:
                    System.out.println("Invalid option.");
            }
        }while(option != 4);
    }
}
