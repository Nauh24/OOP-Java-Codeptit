
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
class Student implements Comparable<Student>{
    private String id,name;
    private int d1,d2,d3;
    private static int cnt=1;
    private int xepLoai;
    public Student(String name, int d1, int d2, int d3) {
        this.name = name;
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
        this.id="SV"+String.format("%02d", cnt++);
    }
    public Double diemTB(){
        double x=((d1*3)+(d2*3)+(d3*2))/8.0;
        //return String.format("%.2f", x);
        //return Math.round(x,2);
        return x;
    }
    public void chuanHoa(){
        String s[]=name.trim().split("\\s+");
        String ans="";
        for(String i: s){
            ans+=i.substring(0,1).toUpperCase()+i.substring(1).toLowerCase()+" ";
        }
        name=ans;
    }

    public void setXepLoai(int xepLoai) {
        this.xepLoai = xepLoai;
    }

    public int getXepLoai() {
        return xepLoai;
    }
    
    @Override
    public int compareTo(Student o) {
        if(diemTB().compareTo(o.diemTB())==0){
            return id.compareTo(o.id);
        }
        else return o.diemTB().compareTo(diemTB());
    }
    public String toString(){
        chuanHoa();
        return id+" "+name+String.format("%.2f", diemTB())+" "+xepLoai;
    }
}
public class J07054_TinhDiemTrungBinh {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc =new Scanner (new File ("BANGDIEM.in"));
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
        double diem=-1;
        int rank=0,cnt=1;
        for(Student i: list){
            if(i.diemTB()==diem){
                cnt++;
                i.setXepLoai(rank);
            }
            else {
                rank+=cnt;
                i.setXepLoai(rank);
                diem=i.diemTB();
                cnt=1;
            }
        }
        for(Student i: list){
            System.out.println(i);
        }
    }
}
