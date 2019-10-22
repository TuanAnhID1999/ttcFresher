package phan2;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class Bai3 {

       private static void bai3(){
        ArrayList<String> listArr = new ArrayList<>();
        String raw = "I", from = "love" , to = "senior";
        listArr.add(raw);
        listArr.add(from);
        listArr.add(to);
        String list= "";
        for (String s: listArr){
            list = listArr.toString();
        }
        System.out.println(list);

        // ký tự phân tách mặc định ở đây là khoảng trắng
        // StringTokenizer stringTokenizer = new StringTokenizer(str);

//        for (int i =0; i <listArr.size();i++){
//          //  System.out.print(listArr.get(i)+", ");
//        }
    }

    public static void main(String[] sgr) {
        bai3();
    }
}
