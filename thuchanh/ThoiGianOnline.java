
package thuchanh;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Scanner;

class SinhVien implements Comparable<SinhVien>{
    private String name;
    private Integer time;

    public SinhVien(String name, int time) {
        this.name = name;
        this.time = time;
    }
    public String toString(){
        return name+" "+time;
    }
    
    @Override
    public int compareTo(SinhVien o) {
        if(o.time.compareTo(time)==0) return name.compareTo(o.name);
        else return o.time.compareTo(time);
        
        
        if(this.time>o.time) return -1;
        else if(this.time>o.time) return 1;
        else return this.name.compareTo(o.name);
               
    }
}
public class ThoiGianOnline {
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        Scanner sc =new Scanner (new File("src/thuchanh/ONLINE.in"));
        int n=Integer.parseInt(sc.nextLine());
        ArrayList<SinhVien> list=new ArrayList<>();
        while(n-- >0){
            String name=sc.nextLine();
            String timeString =sc.nextLine();
            SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            Date date=sdf.parse(timeString);
            long time=date.getTime();
            String timeString2 =sc.nextLine();
            Date date2=sdf.parse(timeString2);
            long time2=date2.getTime();
            int minutes=(int) ((time2-time)/(60000));
            SinhVien sv=new SinhVien(name, minutes);
            list.add(sv);
        }
        Collections.sort(list);
        for(SinhVien i :list){
            System.out.println(i);
        }
    }
}
