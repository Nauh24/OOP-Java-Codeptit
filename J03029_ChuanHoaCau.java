import java.util.ArrayList;
import java.util.Scanner;
public class J03029_ChuanHoaCau {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<String> list=new ArrayList<>();
        while(sc.hasNextLine()){
            String s=sc.nextLine().toLowerCase().trim();
            //if(s.equals("0")) break;
            s=Character.toUpperCase(s.charAt(0))+s.substring(1);
            s=s.replaceAll("\\s+", " ");
            char x=s.charAt(s.length()-1);
            if(x!='!'&&x!='?'&&x!='.') s+=".";
            //s=s.trim();
            s=s.replaceAll("\\s*\\.\\s*",".");
            s=s.replaceAll("\\s*\\!\\s*","!");
            s=s.replaceAll("\\s*\\?\\s*","?");
            list.add(s);
        }
        for(String i:list){
            System.out.println(i);
        }
    }
}
/*
Chuong trinh Dao Tao CLC nganh CNTT duoc Thiet     Ke theo chuan quoc te.
co 03 chuyen nganh la: Cong  nghe phan mem, Tri tue nhan tao va An toan thong tin
muc tieu cua chuong trinh la trang bi cho sinh vien cac ky nang nghe nghiep
moi    CAC BAN danG ky     thaM giA !
*/