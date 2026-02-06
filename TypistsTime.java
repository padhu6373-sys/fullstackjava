import java.util.Scanner;

public class TypistsTime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();   // number of typists
        double rate = 0.0;

        for (int i = 0; i < N; i++) {
            double time = sc.nextDouble();
            rate += 1.0 / time;
        }

        double totalTime = 1.0 / rate;

        System.out.printf("%.2f", totalTime);
        sc.close();
    }
}