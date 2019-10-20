package phan2;

public class Bai3 {
    public static void main(String[] sgr) {
        String str = "nguyen van quan 7826 ";
        str = str.trim();
        str = str.replaceAll(" ", ", ");
        System.out.println(str);
    }
}
