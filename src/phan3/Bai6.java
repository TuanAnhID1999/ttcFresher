package phan3;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Bai6 {

    // làm tròn đến phút, giờ, ngày.
    public static String getCurrentTimeStamp() {
        SimpleDateFormat sdfDate = new SimpleDateFormat("yyyy/MM/dd HH:mm");//dd/MM/yyyy
        Date now = new Date();
        String strDate = sdfDate.format(now);
        return strDate;
    }

    public static void main(String[] args) {
        System.out.println(getCurrentTimeStamp());
    }
}
