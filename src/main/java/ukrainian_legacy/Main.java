package ukrainian_legacy;

public class Main {
    public static void main(String[] args) {
        DataBase db = new DataBase();
        Authorization authorization = new Authorization();
        if (authorization.authorize(db)) {
            ReportBuilder br = new ReportBuilder(db);
        }
    }
}