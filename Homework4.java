import java.util.Scanner;

public class Homework4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("두 수를 입력하세요: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        int resultRecursive = gcd(num1, num2);

        System.out.println("두 수의 최대공약수는 " + resultRecursive + "입니다.");

        scanner.close();
    }

    public static int gcd(int m, int n) {
        if (n == 0) {
            return m;
        }

        int min = Math.min(m, n);
        int max = Math.max(m, n);

        return gcd(min, max % min);
    }

    public static int gcdIterative(int m, int n) {
        if (m == 0) return n;
        if (n == 0) return m;

        int min = Math.min(m, n);
        int max = Math.max(m, n);

        while (min != 0) {
            int remainder = max % min;
            max = min;
            min = remainder;
        }
        return max;
    }
}