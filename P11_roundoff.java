import java.util.Scanner;

public class P11_roundoff {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        int b = Math.round(a);
        System.out.println(b);
    }
}
