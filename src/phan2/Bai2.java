package phan2;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Bai2 {
    static final int N = 256;

    // Cách 1 duyệt mảng
    static char MaxOccuringChar(String str1) {
        int ctr[] = new int[N];
        int l = str1.length();
        for (int i = 0; i < l; i++)
            ctr[str1.charAt(i)]++;
        int max = -1;
        char result = ' ';

        for (int i = 0; i < l; i++) {
            if (max < ctr[str1.charAt(i)]) {
                max = ctr[str1.charAt(i)];
                result = str1.charAt(i);
            }
        }

        return result;
    }

    // Cách 2 dùng HashMap
    public static char getMaxViaHashmap(String s) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        char maxappearchar = ' ';
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
            } else {
                map.put(s.charAt(i), 1);
            }
        }


        int maxValueInMap = (Collections.max(map.values()));
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == maxValueInMap) {
                System.out.println("the max char is : " + entry.getKey() + "  and displayed  " + maxValueInMap );     // Print the key with max value
                maxappearchar = entry.getKey();
            }

        }
        return maxappearchar;
    }

    public static void main(String[] args) {
        String str1 = "test string";
        System.out.println("The given string is: " + str1);
        // System.out.println("Max occurring character in the given string is: " + MaxOccuringChar(str1));
        //Cách 2 sd Map
        System.out.println("Max occurring character in the given string is: ");
        getMaxViaHashmap(str1);
    }
}
