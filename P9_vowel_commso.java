import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P9_vowel_commso {
    static boolean isElementInList(char[] vowel, char ch) {
        for (char x : vowel) {
            if (x == ch) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("type the character");
        char ch = sc.next().charAt(0);
        int asccich = ch;
        char[] vowels = {'a', 'e', 'i', 'o', 'u','A','E','I','O','U'};

        if ((asccich >= 65 && asccich <= 90) || (asccich >= 96 && asccich <= 122)) {
            if (isElementInList(vowels, ch))
                System.out.println("It is a vowel");
            else
                System.out.println("It is a consonant");
        } else
            System.out.println("The input is wrong!!");
    }
}

