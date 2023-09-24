
package thuchanh;
import java.util.Scanner;

public class DemChu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); // Đọc dòng trống sau số lượng bộ test

        for (int i = 0; i < t; i++) {
            String S = sc.nextLine();
            int[] charCount = new int[26];
            int sum = 0;

            for (char c : S.toCharArray()) {
                if (Character.isLetter(c)) {
                    charCount[c - 'A']++;
                } else if (Character.isDigit(c)) {
                    sum += Character.getNumericValue(c);
                }
            }

            StringBuilder result = new StringBuilder();
            for (char c = 'A'; c <= 'Z'; c++) {
                int count = charCount[c - 'A'];
                if (count > 0) {
                    result.append(c).append(count);
                }
            }

            result.append(sum);
            System.out.println(result);
        }
    }
}
