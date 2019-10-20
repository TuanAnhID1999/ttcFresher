package phan1.bai1;

import java.util.Comparator;

// Lớp này thực hiện interface Comparator<Person>.
// Nó là một quy tắc để so sánh các đối tượng Person.
public class PersonComparator implements Comparator<Bill> {

    // Ghi đè (override) phương thức compare.
    // Nêu rõ quy tắc so sánh 2 đối tượng Person.
    @Override
    public int compare(Bill o1, Bill o2) {
        // Hai đối tượng null coi như bằng nhau.
        if (o1 == null && o2 == null) {
            return 0;
        }
        // Nếu o1 là null, coi như o2 lớn hơn
        if (o1 == null) {
            return -1;
        }
        // Nếu o2 là null, coi như o1 lớn hơn.
        if (o2 == null) {
            return 1;
        }
        // Nguyên tắc:
        // Sắp xếp tăng dần theo tuổi.
        int value = o1.getMoney() - o2.getMoney();
        if (value != 0) {
            return value;
        }
        // Nếu tuổi giống nhau, thì so sánh fullName.
        // So sánh theo Alphabet (chữ cái).
        value = o1.getName().compareTo(o2.getName());
        return value;
    }

}