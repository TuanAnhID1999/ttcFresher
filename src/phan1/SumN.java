package phan1;

public class SumN {


    // Dùng vòng for
    private static int sumMethod(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    // Dùng while
    private static void sumMethodN(int n) {
        int start = 1, sum = 0, stop = n;

        while (start <= stop) {
            start++;
            // System.out.println(start);
            sum += start;
            System.out.println(sum);
        }

        System.out.println("Tổng n số tự nhiên = " + sum);
    }

    public static void main(String[] args) {
        System.out.println(sumMethod(3));
        sumMethodN(2);
    }
}
