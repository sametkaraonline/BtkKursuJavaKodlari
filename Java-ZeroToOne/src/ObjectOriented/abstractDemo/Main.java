package ObjectOriented.abstractDemo;

public class Main {
    public static void main(String[] args) {


        CustomerManager customerManager = new CustomerManager();
        customerManager.databaseManager = new MySqlDatabasManager();
        customerManager.getCustomers();

    }

}
