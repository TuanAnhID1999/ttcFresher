package phan2;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class Bai4 {


    private static void bai4() {
        String str = "I, love, you";

        StringTokenizer stringTokenizer = new StringTokenizer(str);
        System.out.println("Kết quả sau khi phân tách theo khoảng trắng: ");
        // kiểm tra xem có còn token kế tiếp trong chuỗi hay không
        // sử dụng phương thức hasMoreTokens()
        while (stringTokenizer.hasMoreTokens()) {
            System.out.print(stringTokenizer.nextToken());
        }

        // phân tách stringTokenizer1 vừa theo dấu phẩy và vừa theo khoảng trắng
        StringTokenizer stringTokenizer1 = new StringTokenizer(str, ", ");

        System.out.println("\nKết quả sau khi phân tách vừa theo dấu phẩy và vừa theo khoảng trắng: ");
        // sử dụng phương thức hasMoreElements()
        while (stringTokenizer1.hasMoreElements()) {
            System.out.print(stringTokenizer1.nextElement() + " ");
        }
    }

    public static void main(String[] sgr) {
        bai4();
    }
}
