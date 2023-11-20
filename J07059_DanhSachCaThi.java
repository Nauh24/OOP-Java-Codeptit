
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
class CaThi implements Comparable<CaThi>{
    private String id,ngay,gio,room;
private static int cnt=1;
    public CaThi(String ngay, String gio, String room) {
        this.ngay = ngay;
        this.gio = gio;
        this.room = room;
        this.id="C"+String.format("%03d", cnt++);
    }
    public String time(){
        String s[] =ngay.split("/");
        String ans="";
        ans=s[2]+s[1]+s[0];
        String s2[] =gio.split(":");
        ans+=s2[0]+s2[1];
        return ans;
    }
    public String toString(){
        return id+" "+ngay+" "+gio+" "+room;
    }

    @Override
    public int compareTo(CaThi o) {
        if(time().compareTo(o.time())==0){
            return id.compareTo(o.id);
        }
        else{
            return time().compareTo(o.time());
        }
    }
}
public class J07059_DanhSachCaThi {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc =new Scanner (new File("CATHI.in"));
        int n=Integer.parseInt(sc.nextLine());
        ArrayList<CaThi> list=new ArrayList<>();
        while(n-- >0){
            String ngay=sc.nextLine();
            String gio=sc.nextLine();
            String room=sc.nextLine();
            CaThi ct=new CaThi(ngay, gio, room);
            list.add(ct);
        }
        Collections.sort(list);
        for(CaThi i: list){
            System.out.println(i);
        }
    }
}
