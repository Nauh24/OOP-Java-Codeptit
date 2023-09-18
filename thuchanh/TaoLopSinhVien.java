
package thuchanh;

import java.util.Scanner;

class Sinhvien{
    private String id ,name ;
    private boolean gt;
    private double bd;

    public Sinhvien() {
    }

    public void input(){
        Scanner sc =new Scanner(System.in);
        this.id =sc.nextLine();
        this.name=sc.nextLine();
        this.gt =Boolean.parseBoolean(sc.nextLine());
        this.bd =Double.parseDouble(sc.nextLine());
 
    }
    public String diem(){
        if(bd>=5) return "dat";
        else return "hoc lai";
    }
    public void chuanHoa(){
        this.id =this.id.toUpperCase();
    }
    public void out(){
        chuanHoa();
        System.out.print(id+" "+name+" "+(gt ?"nam":"nu")+" ");
        System.out.print(diem());
        
    }
    
}
public class TaoLopSinhVien {
    public static void main(String[] args) {
        Sinhvien sv=new Sinhvien();
        //input
        sv.input();
        //output
        sv.out();
        
    }
    
}
