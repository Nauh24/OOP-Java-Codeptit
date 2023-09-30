package thuchanh;
import java.time.LocalDate;
import java.util.Scanner;
class Sinhvien{
    private String id ,name ;
    private int tuoi;
    private double d1,d2;
    public Sinhvien() {
    }
    public void input(){
        Scanner sc =new Scanner(System.in);
        this.id =sc.nextLine();
        this.name=sc.nextLine();
        this.tuoi=Integer.parseInt(sc.nextLine());
        String s =sc.nextLine();
        String[] res =s.split("\\s+");
        this.d1=Double.parseDouble(res[0]);
        this.d2=Double.parseDouble(res[1]);
    }
    public int namSinh(){
        int year = LocalDate.now().getYear();
        return year-tuoi;
    }
    public void chuanHoa(){
        this.id =this.id.toUpperCase();
    }
    public double diemTB(){
        return (d1+2*d2)/3;
    }
    public void out(){
        chuanHoa();
        System.out.print(id+" "+name+" "+namSinh()+" ");
        System.out.printf("%.1f",diemTB());
    }
}
public class TaoLopSinhVien2 {
    public static void main(String[] args) {
        Sinhvien sv=new Sinhvien();
        //input
        sv.input();
        //output
        sv.out();
    }
}
/*
B21dccn123
Le thi Teo
20
4.6 6
*/