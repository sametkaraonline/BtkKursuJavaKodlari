package ObjectOriented.Polymorfizm;

public class EmailLogger extends BaseLogger{
    public void log(String message){
        System.out.println("Loggeed to email:" + message);
    }
}
