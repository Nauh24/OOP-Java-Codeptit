import java.util.Scanner;
public class J03022_XuLyVanBan {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s="";
        while(sc.hasNextLine()){
           // if(sc.next().equals("0")) break;
            s+=sc.nextLine();
        }
        String a[]=s.trim().toLowerCase().split("[.?!]");
        for(String i: a){
            i=i.trim();
            i=Character.toString(i.charAt(0)).toUpperCase()+i.substring(1);
            for(String j:i.split("\\s+")){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
/*
ky thi LAP TRINH ICPC PTIT  bat dau to chuc     tu     nam 2010. nhu vay, nam nay la          tron 10 nam!
    vay CO PHAI NAM NAY LA KY THI LAN THU 10?        khong phai! nam nay la KY THI LAN THU 11.
*/