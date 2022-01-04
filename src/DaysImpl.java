import java.sql.Time;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;

public class DaysImpl implements Days, Dates {

    @Override
    public void callback() {
        System.out.println("call me");
    }

    @Override
    public int age() {
        return 30;
    }

    @Override
    public void date() {
        Date date = new Date();
        LocalDateTime localDateTime = LocalDateTime.now();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
        simpleDateFormat.format(date);
        System.currentTimeMillis();
    }

}
