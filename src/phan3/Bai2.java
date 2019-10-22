package phan3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Bai2 {
    public static void upDownDate() {

        // Định dạng thời gian
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        Calendar c2 = Calendar.getInstance();
        //  Date date = Date.valueOf("2011-07-31");
        Date date = new Date();
        c2.setTime(date);

        // Tăng ngày thêm 8 ngày -- Sử dụng phương thức add()
        c2.add(Calendar.DATE, 100);
        //c2.add(Calendar.DATE, -8); // Giảm ngày 8 ngày ==> 23-07-2011
        System.out.println("Ngày được tăng thêm 100 ngày (Sử dụng add)  : "
                + dateFormat.format(c2.getTime()));

        /* Các trường hợp khác :
        c2.add(Calendar.MONTH, 2);   //Tăng lên 2 tháng
        c2.add(Calendar.YEAR, 2) ;      //Tăng lên 2 năm
        */

    }


    private static void getTime() throws ParseException {
        // get today and clear time of day
        Calendar cal = Calendar.getInstance();

        SimpleDateFormat dt1 = new SimpleDateFormat("yyyy/MM/dd");

        // get start of this week in milliseconds
        cal.set(Calendar.DAY_OF_WEEK, cal.getFirstDayOfWeek());
        System.out.println("Start of this week:       " + dt1.format(cal.getTime()));

        // get start of the month
        cal.set(Calendar.DAY_OF_MONTH, 1);
        System.out.println("Start of the month:       " +  dt1.format(cal.getTime()));

        // get last of the month
        cal.set(Calendar.DAY_OF_MONTH, cal.getActualMaximum(Calendar.DAY_OF_MONTH));
        System.out.println("Last of the month:       " + dt1.format(cal.getTime()));

        // get start of the year
        cal.set(Calendar.DAY_OF_YEAR, 1);
        System.out.println("Start of the year:       " +  dt1.format(cal.getTime()));

    }

    public static void main(String[] args) throws ParseException {

        upDownDate();
        getTime();
    }
}
