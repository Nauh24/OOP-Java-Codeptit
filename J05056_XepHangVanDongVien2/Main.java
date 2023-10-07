
package J05056_XepHangVanDongVien2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner sc =new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        SimpleDateFormat sdf1 =new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdf2=new SimpleDateFormat("HH:mm:ss");
        ArrayList<VanDongVien> list=new ArrayList<>(n);
        while(n-- >0){
            String name=sc.nextLine();
            Date bd=sdf1.parse(sc.nextLine());
            Date xuatPhat=sdf2.parse(sc.nextLine());
            Date dich=sdf2.parse(sc.nextLine());
            VanDongVien vdv=new VanDongVien(name, bd, xuatPhat, dich);
            list.add(vdv);
        }
        Collections.sort(list);
        int rank=0,cnt=1;
        String cur="";
        for(VanDongVien i: list){
            if(i.thanhTichXepHang().equals(cur)){
                cnt++;
            }
            else{
                rank+=cnt;
                cnt=1;
            }
            cur=i.thanhTichXepHang();
            i.setRank(rank);
        }
        for(VanDongVien i :list){
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