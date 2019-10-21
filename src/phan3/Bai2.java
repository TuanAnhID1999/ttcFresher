package phan3;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Bai2 {
    public static void upDownDate() {

        // Định dạng thời gian
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");

        Calendar c1 = Calendar.getInstance();
        Calendar c2 = Calendar.getInstance();

        // Định nghĩa mốc thời gian ban đầu là ngày 31-07-2011

      //  Date date = Date.valueOf("2011-07-31");
        Date date = new Date();

        c1.setTime(date);
        c2.setTime(date);

        System.out.println("Ngày ban đầu : " + dateFormat.format(c1.getTime()));

        // Tăng ngày thêm 8 ngày -- Sử dụng phương thức roll()
     //   c1.roll(Calendar.DATE, 100);

        // c1.roll(Calendar.DATE, -8); // Giảm ngày 8 ngày ==> 23-07-2011
      //  System.out.println("Ngày được tăng thêm 100 ngày (Sử dụng Roll) : "+ dateFormat.format(c1.getTime()));


        /* Các trường hợp khác
        c1.roll(Calendar.DATE, true); //Tăng 1 ngày -- Nếu muốn giảm một ngày truyền vào false
        c1.roll(Calendar.MONTH, 2);   //Tăng lên 2 tháng
        c1.roll(Calendar.YEAR, 2) ;      //Tăng lên 2 năm
        */

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
    public static void main(String[] args) {
        upDownDate();
    }
}
