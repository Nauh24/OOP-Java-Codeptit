
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.text.CharacterIterator;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class J07085_TongChuSo {

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        //Scanner sc =new Scanner(new File("src/DATA.in"));
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<String> list = (ArrayList<String>) ois.readObject();
        // while(sc.hasNext()){
        //   String s=sc.next();

        for (String s : list) {
            String ans = "";
            int tong = 0;
            for (int i = 0; i < s.length(); i++) {
                if (Character.isDigit(s.charAt(i))) {
                    if (!(ans.length() == 0 && s.charAt(i) == '0')) {
                        ans += s.charAt(i);
                        tong += (int) s.charAt(i) - '0';
                    }

                }
            }
            System.out.println(ans + " " + tong);
        }
    }
}
