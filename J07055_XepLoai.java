
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
class Student implements Comparable<Student>{
    private String id,name;
    private static int cnt=1;
    private int d1,d2,d3;

    public Student(String name, int d1, int d2, int d3) {
        this.name = name;
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
        this.id="SV"+String.format("%02d", cnt++);
    }
    public Double diemTK(){
        double x=((double)(d1*0.25+d2*0.35+d3*0.4));
        return x;
    }
    public String xepLoai(){
        if(diemTK()>=8) return "GIOI";
        if(diemTK()>=6.5) return "KHA";
        if(diemTK()>=5) return "TRUNG BINH";
        return "KEM";
    }
    public void chuanHoa(){
        String s[]=name.trim().split("\\s+");
        String ans="";
        for(String i: s){
            ans+=i.substring(0,1).toUpperCase()+i.substring(1).toLowerCase()+" ";
        }
        name=ans;
    }
    @Override
    public int compareTo(Student o) {
        return o.diemTK().compareTo(diemTK());
    }
    public String toString(){
        chuanHoa();
        return id+" "+name+String.format("%.2f", diemTK())+" "+xepLoai();
    }
}
public class J07055_XepLoai {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc =new Scanner(new File("BANGDIEM.in"));
        int n=Integer.parseInt(sc.nextLine());
        ArrayList<Student> list=new ArrayList<>();
        while(n-- >0){
            String name=sc.nextLine().trim();
            int d1=Integer.parseInt(sc.nextLine());
            int d2=Integer.parseInt(sc.nextLine());
            int d3=Integer.parseInt(sc.nextLine());
            Student st=new Student(name, d1, d2, d3);
            list.add(st);
        }
        Collections.sort(list);
        for(Student i: list){
            System.out.println(i);
        }
    }
}
