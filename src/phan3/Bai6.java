package phan3;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Bai6 {

    // làm tròn đến phút, giờ, ngày.
    public static void getCurrentTimeStamp() {
        String inDate =  "2012/07/10 14:58:00";
        DateFormat df = new SimpleDateFormat("yyyy/MM/dd HH:mm");
        try {
            Timestamp ts = new Timestamp(((java.util.Date)df.parse(inDate)).getTime());
            System.out.println(ts);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        getCurrentTimeStamp();
    }
}
