package phan3;

import java.sql.Date;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Bai5 {
    public static void main(String[] args) {
        String inDate =  "2012/07/10 14:58:00";
        DateFormat df = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        try {
            Timestamp ts = new Timestamp(((java.util.Date)df.parse(inDate)).getTime());
            System.out.println(ts);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
