package thuchanh;

import java.util.Scanner;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LogThoiGian {

    public static boolean isTimeFormatValid(String time) {
        String timeRegex = "([01]?[0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9]";
        Pattern pattern = Pattern.compile(timeRegex);
        Matcher matcher = pattern.matcher(time);
        return matcher.matches();
    }

    public static void main(String[] args) {
        TreeSet<String> list = new TreeSet<>();
        Scanner sc = new Scanner(System.in);
        String res = "";
        while (sc.hasNext()) {
            String s = sc.nextLine();
            if(s.equals("...")) break;
            String[] words = s.split("[ \t\n.,]+");
            for (String i : words) {
                if (isTimeFormatValid(i)) {
                    list.add(i);
                }
            }
        }
        for (String i : list) {
            System.out.println(i);
        }
    }
}
/*
[BeginLog]
[Boot Session: 2023/01/31
23:22:00.500]
09:50:44.356 WINWORD (0x43A4)
Section 2023/01/31 10:22:16, 538new 
{FILE_QUEUE_COMMIT} 10:22:16.569
Start: 14:17:50.111over
End: 14:17:50.899over

*/
