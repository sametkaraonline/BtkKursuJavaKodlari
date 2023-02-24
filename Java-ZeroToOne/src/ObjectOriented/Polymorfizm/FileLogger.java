package ObjectOriented.Polymorfizm;

public class FileLogger extends BaseLogger{

    public void log(String message){
        System.out.println("Loggeed to file:" + message);
    }
}
