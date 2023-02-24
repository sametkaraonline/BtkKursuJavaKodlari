package exceptionHandling.throwDemo;

public class AccountManager {
    private double balance;

    public void deposit(double amount){
        balance = getBalance() + amount;
    }
    public void witdraw(double amount) throws BalanceInsufficentException {
        if(balance>=amount){
            balance = getBalance() - amount;
        }else {
            throw new BalanceInsufficentException("Bakiye yetersiz");
            //System.out.println("Hesaptan para çekilemedi, bakiye yetersiz!");
        }
    }


    public double getBalance() {
        return balance;
    }

}
