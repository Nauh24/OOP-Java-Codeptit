
package J07013_DanhSachSinhVienTrongFileNhiPhan;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException, ParseException, IOException, ClassNotFoundException {
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("SV.in"));
        ArrayList<SinhVien> list= (ArrayList<SinhVien>) ois.readObject();
        for(SinhVien i: list){
            System.out.println(i);
        }
    }
}
