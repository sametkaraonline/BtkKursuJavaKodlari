package ObjectOriented.abstractDemo;

public class MySqlDatabasManager extends BaseDatabaseManager{
    @Override
    public void getData() {
        System.out.println("Veri getirildi: Mysql");
    }
}
