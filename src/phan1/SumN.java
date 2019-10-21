package phan1;

import java.util.Scanner;

public class SumN {


    // Dùng vòng for với độ phức tạp O(n)
    private static void sumMethod(int n) {
        int sum = 0;
        if (n > 0) {
            for (int i = 0; i <= n; i++) {
                sum += i;
            }
            System.out.println("Tổng n số tự nhiên = " + sum);
        } else {
            System.out.println("n không hợp lệ, mời bạn nhập lại với n >= 0");
        }
    }

    // Dùng while
    private static void sumMethodN(int n) {
        int start = 1, sum = 0, stop = n;

        if (n > 0) {
            while (start <= stop) {
                sum += start;
                start++;
            }
            System.out.println("Tổng n số tự nhiên = " + sum);
        } else {
            System.out.println("n không hợp lệ, mời bạn nhập lại với n >= 0");
        }


    }
    // Sử dụng đệ quy với độ phưc tạo O(1)
    private static  int calculateSum(int num) {
        int res;
        if (num == 1) {
            return (1);
        } else {
            res = num + calculateSum(num - 1);
        }
        return (res);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập n: ");
        int n = sc.nextInt();
        // sumMethod(n);
       // sumMethodN(n);
        int resuilt = calculateSum(n);
        System.out.println("Tổng của "+ n+ " là " + resuilt);
    }
}
