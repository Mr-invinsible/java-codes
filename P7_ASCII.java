import java.util.Scanner;

public class P7_ASCII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the character");
        char ch = sc.next().charAt(0);
        int ascii = ch;
        System.out.println("the ASCII code for "+ch+" is "+ascii);
    }
}
