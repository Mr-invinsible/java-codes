import java.util.*;

public class P12_vowelConsonant {
    public static boolean IsVowel(char x){
        char[] vowel={'a','e','i','o','u','A','E','I','O','U'};
        boolean flag = false;
        for(char z:vowel){
            if (z==x){
                flag = true;
                break;
            }
        }
        return flag;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] a = s.toCharArray();
        for(char x:a){
            if (IsVowel(x))
                System.out.println(x+" vowel");
            else
                System.out.println(x+" consonant");
        }
    }
}
