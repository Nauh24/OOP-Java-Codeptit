/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J07025_DanhSachKhachHangTrongFile;

/**
 *
 * @author Admin
 */
public class KhachHang implements Comparable<KhachHang>{
    private String id,name,sex,bd,add;
    private static int cnt=1;

    public KhachHang(String name, String sex, String bd, String add) {
        this.name = name;
        this.sex = sex;
        this.bd = bd;
        this.add = add;
        this.id="KH"+String.format("%03d",cnt++);
    }
    public void chuanHoaName(){
        String s[]=name.trim().toLowerCase().split("\\s+");
        String res="";
        for(String i:s){
            res+=i.substring(0,1).toUpperCase()+i.substring(1)+" ";
        }
        name=res;
    }
    public void chuanHoaBd(){
        StringBuilder sb=new StringBuilder(bd);
        if(sb.charAt(2)!='/') sb.insert(0, "0");
        if(sb.charAt(5)!='/') sb.insert(3,"0");
        bd=sb.toString();
    }
    public String tmpBd(){
        chuanHoaBd();
        String s=bd.substring(6)+bd.substring(3,5)+bd.substring(0,2);
        return  s;
        
    }
    public String toString(){
        chuanHoaBd();
        chuanHoaName();
        return id+" "+name+" "+sex+" "+add+" "+bd;
    }

    @Override
    public int compareTo(KhachHang o) {
        return tmpBd().compareTo(o.tmpBd());
    }
}
