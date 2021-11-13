package ukrainian_legacy;

public class Authorization extends Авторизація{
    public boolean authorize(DataBase db){
        return this.авторизуватися(db);
    }
}
