/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J07081_SapXepDanhSachSinhVien;

/**
 *
 * @author Admin
 */
public class Student implements Comparable<Student>{
    private String id,name;
    private String sdt,emai;
    
    public Student(String id, String name, String sdt, String emai) {
        this.id = id;
        this.name = name;
        this.sdt = sdt;
        this.emai = emai;
    }
    private String ten(){
        String [] s=name.split("\\s+");
        return s[s.length-1];
    }
    private String hodem(){
        String [] s=name.split("\\s+");
        String res="";
        for(int i=0;i<s.length-1;i++){
            res+=s[i]+" ";
        }
        return res;
    }
    
    @Override
    public int compareTo(Student o) {
        String ans1=ten() +hodem()+id;
        String ans2=o.ten() +o.hodem()+o.id;
        return ans1.compareTo(ans2);
    }
    
    public String toString(){
        return id+" "+name+" "+sdt+" "+emai;
    }
}
