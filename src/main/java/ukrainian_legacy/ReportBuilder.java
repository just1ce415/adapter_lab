package ukrainian_legacy;

import lombok.Getter;

@Getter
public class ReportBuilder {
    private DataBase db;
    public ReportBuilder(DataBase db) {
        this.db = db;
    }
}
