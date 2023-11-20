
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
class Student implements Comparable<Student>{
    private String id,name,lop,email;

    public Student(String id, String name, String lop, String email) {
        this.id = id;
        this.name = name;
        this.lop = lop;
        this.email = email;
    }
    private void chuanHoa(){
        String [] s=name.trim().split("\\s+");
        String ans="";
        for(String i: s){
            ans+=i.substring(0,1).toUpperCase()+i.substring(1).toLowerCase()+" ";
        }
        name=ans;
    }
    @Override
    public int compareTo(Student o) {
        return id.compareTo(o.id);
    }
    public String toString(){
        chuanHoa();
       return id+" "+name+lop+" "+email;
    }
}
public class J07033_DanhSachSinhVienTrongFile1 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc =new Scanner(new File("SINHVIEN.in"));
        int n=Integer.parseInt(sc.nextLine());
        ArrayList<Student> list=new ArrayList<>();
        while(n-- >0){
            String id=sc.nextLine();
            String name=sc.nextLine();
            String lop=sc.nextLine();
            String email=sc.nextLine();
            Student st=new Student(id, name, lop, email);
            list.add(st);
        }
        Collections.sort(list);
        for(Student i : list){
            System.out.println(i);
        }
    }
}
