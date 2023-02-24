package exceptionHandling.throwDemo;

public class Main {
    public static void main(String[] args){

        AccountManager accountManager = new AccountManager();
        System.out.println("Hesap: "+ accountManager.getBalance());
        accountManager.deposit(100);
        System.out.println("Hesap: "+ accountManager.getBalance());
        try {
            accountManager.witdraw(90);
        }catch (BalanceInsufficentException exception){
            System.out.println(exception.getMessage());
        }

        System.out.println("Hesap: "+ accountManager.getBalance());

        try {
            accountManager.witdraw(90);
        }catch (BalanceInsufficentException exception){
            System.out.println(exception.getMessage());
        }

        System.out.println("Hesap: "+ accountManager.getBalance());


    }

}
