
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class J07078_TimViTriXauCon {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("src/STRING.in"));
        int n = Integer.parseInt(sc.nextLine());
        while (n-- > 0) {
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            int m = s2.length();
            for (int i = 0; i <= s1.length() - m; i++) {
                if (s1.substring(i, i + m).equals(s2)) {
                    System.out.print(i + 1 + " ");
                }
            }
            System.out.println();
        }

    }
}
