import java.util.Scanner;

public class KthDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        String num = sc.next();

        System.out.print("Enter k value: ");
        int k = sc.nextInt();

        if (k > num.length()) {
            System.out.println(-1);
        } else {
            System.out.println(num.charAt(k - 1));
        }

        sc.close();
    }
}