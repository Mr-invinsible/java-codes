import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class P13_frequency {
    public static void main(String[] args) {
        Map<Character, Integer> alpha = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        char[] b = a.toCharArray();

        for (char x : b) {
            if (alpha.containsKey(x)) {
                alpha.put(x, alpha.get(x) + 1);
            } else {
                alpha.put(x, 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : alpha.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
