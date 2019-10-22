package phan3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.YearMonth;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.concurrent.TimeUnit;

public class Bai4 {
    static SimpleDateFormat myFormat = new SimpleDateFormat("dd MM yyyy");


    private static  void getRange(){
        LocalDate startDate = LocalDate.of(2010, 1, 15);
        LocalDate endDate = LocalDate.of(2011, 3, 18);

        // tính sự chênh lệch giữa startDate và endDate
        // sử dụng hàm between() của Peridot
        // Để sử dụng Peridot chúng ta sẽ import gói thư viện java.time.Period của Java
        Period different = Period.between(startDate, endDate);

        System.out.println("Sự chênh lệch giữa startDate và endDate là " +
                different.getYears() + "  năm " + different.getMonths() + "  tháng và " +
                different.getDays() + " ngày.");
    }

    public static void main(String[] args) {
        getRange();

    }
}
