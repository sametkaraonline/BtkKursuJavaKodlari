package ObjectOriented.Polymorfizm;

public class ConsoleLogger extends BaseLogger{
    public void log(String message){
        System.out.println("Loggeed to console:" + message);
    }
}
