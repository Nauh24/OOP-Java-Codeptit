
package J05055_XepHangVanDongVien1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdf2 = new SimpleDateFormat("HH:mm:ss");

        ArrayList<VanDongVien> list = new ArrayList<>(n);
        while (n-- > 0) {
            String name = sc.nextLine();
            Date bd = sdf1.parse(sc.nextLine());
            Date xp = sdf2.parse(sc.nextLine());
            Date dich = sdf2.parse(sc.nextLine());
            VanDongVien vdv = new VanDongVien(name, bd, xp, dich);
            list.add(vdv);
        }
        list.sort(Comparator.comparing(VanDongVien::thanhTichXepHang));
        int rank = 0, cnt = 1;
        String cur = "";
        for (VanDongVien i : list) {
            if (i.thanhTichXepHang().equals(cur)) {
                cnt++;
            } else {
                rank += cnt;
                cnt = 1;
            }
            cur = i.thanhTichXepHang();
            i.setRank(rank);

        }
        list.sort(Comparator.comparing(VanDongVien::getId));
        for (VanDongVien i : list) {
            System.out.println(i);
        }
    }
}
/*
3
Nguyen Van Thanh
20/03/1990
07:00:00
07:10:01
Nguyen Hoa Binh
01/10/1993
07:02:00
07:11:20
Le Thanh Van
15/03/1998
07:05:00
07:15:30
*/
