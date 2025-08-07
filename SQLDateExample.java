import java.sql.Date;

public class SQLDateExample {
    public static void main(String[] args) {
        long millis = System.currentTimeMillis();
        Date date=new Date(millis);
        System.out.println("SQL Date "+date.toString());
    }
}