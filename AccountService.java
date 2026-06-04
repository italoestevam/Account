package contaBancaria;
public class AccountService {
    //Métodos
    public void deposit( Account account, double value){
           if(value <= 0 ){
               System.out.printf("Valor inválido.");
           }else{
                account.setBalance(
                       account.getBalance() + value);
           }
    }
    public boolean withdraw(Account account , double value){
       if (value <= 0 || account.getBalance() < value){
           return false;
       }
       account.setBalance(account.getBalance() - value);
       return true;
    }
}
