
import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
class SinhVien{
    private String id,name,lop,dob;
    private float gpa;
    private static int cnt=1;

    public SinhVien(String name, String lop, String dob, float gpa) throws ParseException {
        this.id = "B20DCCN"+String.format("%03d",cnt++);
        this.name = name;
        this.lop = lop;
        SimpleDateFormat sdf =new SimpleDateFormat("dd/MM/yyyy");
        this.dob = sdf.format(sdf.parse(dob));
        this.gpa = gpa;
    }
    public String toString(){
        return id+" "+name+" "+lop+" "+dob+" "+String.format("%.2f", gpa);
    }
}
public class J07010_DanhSachSinhVienTrongFile2 {
    public static void main(String[] args) throws FileNotFoundException, ParseException{
        Scanner sc =new Scanner(new File("SV.in"));
        int n=Integer.parseInt(sc.nextLine());
        while(n-- >0){
            String name=sc.nextLine();
            String lop=sc.nextLine();
            String dob=sc.nextLine();
            float gpa=Float.parseFloat(sc.nextLine());
            SinhVien sv =new SinhVien(name, lop, dob, gpa);
            System.out.println(sv);
        }
    }
}
