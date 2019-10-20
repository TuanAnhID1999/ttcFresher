package phan2;

import java.util.Map;
import java.util.TreeMap;


//Truyền chuỗi String và 1 ký tự. Đếm số lần xuất hiện ký tự đó trong chuỗi, vị trí đầu tiên, cuối cùng và vị trí thứ n trong chuỗi.
public class Bai1 {

    public static final char SPACE = ' ';
    public static final char TAB = '\t';
    public static final char BREAK_LINE = '\n';


    public static void main(String[] args) {
        String str = "hoc java     co ban den nang cao hoc c++ co ban den nang cao. 8 * #";
        System.out.println(str);
        System.out.println("---------------------------------");
        // liệt kê sô lần xuất hiện của các từ trong chuỗi trên
        System.out.println("Liệt kê số lần xuất hiện của các từ: ");
        Map<String, Integer> wordMap = countWords(str);
        for (String key : wordMap.keySet()) {
            System.out.print(key + " " + wordMap.get(key) + "\n");
        }
    }

    /**
     * Đếm số từ của một chuỗi,
     * giả sử các từ được ngăn cách nhau bởi một hoặc nhiều
     * dấu 'space', tab '\t' và xuống dòng '\n'
     *
     * @param input - chuỗi ký tự
     * @return số từ của chuỗi ký tự input
     */
    public static Map<String, Integer> countWords(String input) {
        // khởi tạo wordMap
        Map<String, Integer> wordMap = new TreeMap<>();
        if (input == null) {
            return wordMap;
        }
        int size = input.length();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            if (input.charAt(i) != SPACE && input.charAt(i) != TAB
                    && input.charAt(i) != BREAK_LINE) {
                // build một từ
                sb.append(input.charAt(i));
            } else {
                // thêm từ vào wordMap
                addWord(wordMap, sb);
                sb = new StringBuilder();
            }
        }
        // thêm từ cuối cùng tìm được vào wordMap
        addWord(wordMap, sb);
        return wordMap;
    }

    /**
     * Thêm từ vào wordMap
     *
     * @param wordMap: map chứa các từ và số lần xuất hiện
     * @param sb: từ cần thêm vào wordMap
     */
    public static void addWord(Map<String, Integer> wordMap, StringBuilder sb) {
        String word = sb.toString();
        if (word.length() == 0) {
            return;
        }
        if (wordMap.containsKey(word)) {
            int count = wordMap.get(word) + 1;
            wordMap.put(word, count);
        } else {
            wordMap.put(word, 1);
        }
    }
}

