
import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Scanner;

class Khach implements Comparable<Khach>{

    private String id, name, roomId;
    private Long time;
    private static int cnt = 1;

    public Khach(String name, String roomId, Long time) {
        this.id = "KH" + String.format("%02d", cnt++);
        this.name = name;
        this.roomId = roomId;
        this.time = time;
    }

    public String toString() {
        return id + " " + name + " " + roomId + " " + time;
    }

    @Override
    public int compareTo(Khach o) {
       return o.time.compareTo(time);
    }
}

public class J07046_DanhSachLuuTru {

    public static void main(String[] args) throws FileNotFoundException, ParseException {
        Scanner sc = new Scanner(new File("KHACH.in"));
        try {
            int n=Integer.parseInt(sc.nextLine());
            ArrayList<Khach> list=new ArrayList<>();
            SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
            while(n-- >0){
                String name=sc.nextLine();
                String roomId=sc.nextLine();
                Date ngayDen=sdf.parse(sc.nextLine());
                Date ngayDi=sdf.parse(sc.nextLine());
                Long time=((ngayDi.getTime()-ngayDen.getTime())/86400000);
                Khach k=new Khach(name, roomId, time);
                list.add(k);
            }
            Collections.sort(list);
            for(Khach i : list){
                System.out.println(i);
            }
        } catch (NullPointerException e) {
        }
    }
}
