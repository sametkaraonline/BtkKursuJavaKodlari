package ObjectOriented.Polymorfizm;

public class Main {
    public static void main(String[] args) {

        //aslında hepsi bir baselogger
//        BaseLogger[] loggers = new BaseLogger[]{new FileLogger(),new EmailLogger(),new DatabaseLogger(),new ConsoleLogger()};
//
//        //int[] sayilar = new int[]{2,23,4,"adssad"};
//
//        for (BaseLogger logger:loggers){
//            logger.Log("Log mesajı");
//        }

        //Burada Database file hepsine loglayabilirim, işte çok biçimlilik bu.
        CustomerManager customerManager = new CustomerManager(new FileLogger());
        customerManager.add();
    }
}
