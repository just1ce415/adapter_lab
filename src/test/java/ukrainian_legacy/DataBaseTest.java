package ukrainian_legacy;

import static org.junit.jupiter.api.Assertions.*;

class DataBaseTest {

    DataBase db = new DataBase();
    ReportBuilder reportBuilder = new ReportBuilder(db);

    @org.junit.jupiter.api.Test
    void getUserData() {
        assertEquals("hello", reportBuilder.getDb().getUserData());
    }

    @org.junit.jupiter.api.Test
    void getStatisticalData() {
        assertEquals("hello2", reportBuilder.getDb().getStatisticalData());
    }
}