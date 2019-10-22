package phan2;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;


//Truyền chuỗi String và 1 ký tự. Đếm số lần xuất hiện ký tự đó trong chuỗi, vị trí đầu tiên, cuối cùng và vị trí thứ n trong chuỗi.
public class Bai1 {
    public static void main(String[] args) {
        countRepeatedWords(" you should use a HashMap instead.");
    }

    public static void countRepeatedWords(String wordToFind) {
        String[] words = wordToFind.split(" ");
        HashMap<String, Integer> wordMap = new LinkedHashMap<String, Integer>();

        for (String word : words) {
            wordMap.put(word,
                    (wordMap.get(word) == null ? 1 : (wordMap.get(word) + 1)));
        }

        System.out.println(wordMap);
    }
}

