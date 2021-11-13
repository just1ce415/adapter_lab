package ukrainian_legacy;

public class DataBase extends БазаДаних{

    public String getUserData(){
        return this.отриматиДаніКористувача();
    }

    public  String getStatisticalData(){
        return this.отриматиСтатистичніДані();
    }
}
