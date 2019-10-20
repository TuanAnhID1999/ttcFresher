package phan2;

public class Bai5 {
    public static void main(String[] sgr) {
        String raw = "I am fresher kevil tuan anh", from = "fresher" , to = "senior";
       // str = str.trim();
        raw = raw.replaceAll(from, to);
        System.out.println(raw);
    }
}
