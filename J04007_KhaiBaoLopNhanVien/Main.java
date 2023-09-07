
package J04007_KhaiBaoLopNhanVien;

import java.util.Scanner;
class NhanVien {
    private String id,name ,sex ,dateOfBird ,add ,msThue ,dateKi ;

    public NhanVien(String id, String name, String sex, String dateOfBird, String add, String msThue, String dateKi) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.dateOfBird = dateOfBird;
        this.add = add;
        this.msThue = msThue;
        this.dateKi = dateKi;
    }
    public String toString(){
        return this.id+" "+this.name+" "+this.sex+" "+this.dateOfBird+" "+this.add+" "+this.msThue+" "+this.dateKi;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String name =sc.nextLine();
       
        String sex =sc.nextLine();
        String dateOfBird =sc.nextLine();
        String add =sc.nextLine();
        
        String msThue =sc.nextLine();
        String dateKi =sc.nextLine();
        NhanVien nv =new NhanVien("00001", name, sex, dateOfBird, add, msThue, dateKi);
        System.out.println(nv);
    }
}
