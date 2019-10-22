package phan3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Bai1 {

    public static void main(String[] args) throws ParseException {
        String str = "2012-07-10 14:58:00";
        Date temp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
                .parse(str);
        System.out.println(temp);
    }
}
