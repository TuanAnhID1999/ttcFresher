package phan3;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Bai7 {
    // Loại 1 yyyy-MM-dd HH:mm:ss
    public static String getCurrentTimeStampKind1() {
        SimpleDateFormat sdfDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//dd/MM/yyyy
        Date now = new Date();
        String strDate = sdfDate.format(now);
        return strDate;
    }

    // Loại 2 MMM yyyy,dd HH:mm:ss
    public static String getCurrentTimeStampKind2() {
        SimpleDateFormat sdfDate = new SimpleDateFormat("MMM yyyy,dd HH:mm:ss");//dd/MM/yyyy
        Date now = new Date();
        String strDate = sdfDate.format(now);
        return strDate;
    }

    public static void main(String[] args) {
        System.out.println(getCurrentTimeStampKind1());
        System.out.println(getCurrentTimeStampKind2());
    }
}
