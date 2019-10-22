package phan1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Solution{
    public static void main(String []argh){
        Map<String, String> phoneAddress = new HashMap<>();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            String name = in.next();
            String phone = in.next();
            phoneAddress.put(name, phone);

        }
        while (in.hasNext()) {
            String s = in.next();
            //cach 1
            if(phoneAddress.containsKey(s)){
                System.out.printf("%s=%d\n", s, phoneAddress.get(s));
            } else {
                System.out.println("Không tìm thấy");
            }

            //cach 2
            String number = phoneAddress.get(s);
            if (number != null) {
                System.out.printf("%s=%d\n", s, phoneAddress.get(s));
            } else {
                System.out.println("Không tìm thấy");
            }
        }
        in.close();
    }
}