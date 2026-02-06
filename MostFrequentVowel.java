import java.util.Scanner;

public class MostFrequentVowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().toLowerCase();

        int a = 0, e = 0, i = 0, o = 0, u = 0;

        for (int j = 0; j < s.length(); j++) {
            char ch = s.charAt(j);
            if (ch == 'a') a++;
            else if (ch == 'e') e++;
            else if (ch == 'i') i++;
            else if (ch == 'o') o++;
            else if (ch == 'u') u++;
        }

        char vowel = 'a';
        int max = a;

        if (e > max) { max = e; vowel = 'e'; }
        if (i > max) { max = i; vowel = 'i'; }
        if (o > max) { max = o; vowel = 'o'; }
        if (u > max) { max = u; vowel = 'u'; }

        System.out.println(vowel);
        sc.close();
    }
}