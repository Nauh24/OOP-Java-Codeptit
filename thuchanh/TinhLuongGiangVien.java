
package thuchanh;

import java.util.Scanner;
class GiangVien{
    private String id ,name;
    private long salary;
    private String heSo;

    public GiangVien(String id, String name, long salary, String heSo) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.heSo = heSo;
    }

    
    public double getHeSo(){
        switch (heSo) {
            case "A":
                return 1.5;
            case "B":
                return 1.2;
            case "C":
                return 1;
        }
        return 0;
    }
    public double thuNhap(){
        return (double) this.salary*this.getHeSo()*250000;
    }
    public String toString(){
        return id+" "+name+" "+heSo+" "+String.format("%.0f",thuNhap());
    }
}
public class TinhLuongGiangVien {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        GiangVien gv =new GiangVien(sc.nextLine(), sc.nextLine(),Integer.parseInt(sc.nextLine()),sc.nextLine());
        System.out.println(gv);
    }
}
