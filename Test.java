import static java.lang.Math.*;
import java.util.ArrayList;
import java.util.Scanner;

class SinhVien {
    private String ten,ma,ns,lop;
    private float gpa;
    public static int dem=0;
    public SinhVien(String lop,String ten, String ma, String ns, float gpa) {
        this.lop=lop;
        this.ten = ten;
        
        
        this.ma = ma;
        this.ns = ns;
        this.gpa = gpa;
    }
    
    public void chuanHoa()
    {
        String[] a=ten.split("\\s+");
        String res="";
        for(String x:a)
        {
            res+=Character.toUpperCase(x.charAt(0));
            for(int i=1;i<x.length();i++)
            {
                res+=Character.toLowerCase(x.charAt(i));
            }
            res+=" ";
        }
        ten=res.trim();
    }
    
    public void chuanNs()
    {
        StringBuilder sb=new StringBuilder(ns);
        if(sb.charAt(1)=='/') sb.insert(0,'0');
        if(sb.charAt(4)=='/') sb.insert(3,'0');
        ns=sb.toString();
    }
    
    
    
    @Override
    public String toString()
    {
            return lop+" "+ten+" "+ma+" "+ns+" "+String.format("%.02f", gpa);
        
    }
}

public class Test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int t=Integer.parseInt(sc.nextLine());
        
        ArrayList <SinhVien> a=new ArrayList<>();
        for(int i=0;i<t;i++)
        {
//            sc.nextLine();
            SinhVien m=new SinhVien("B20DCCN"+String.format("%03d", i+1),sc.nextLine(),sc.nextLine(),sc.nextLine(),Float.parseFloat(sc.nextLine()));
            
            a.add(m);
        }
        for(SinhVien x:a)
        {
            System.out.println(x);
        }
    }
}


/*
1
Nguyen Van An
D20CQCN01-B
2/12/2002
3.19
*/
