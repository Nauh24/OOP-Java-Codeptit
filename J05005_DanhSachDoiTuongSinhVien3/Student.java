
package J05005_DanhSachDoiTuongSinhVien3;

public class Student implements Comparable<Student>{
    private String id ,name , grade ,bd ;
    private float gpa;
    static int cnt=1;

    public Student() {
    }
    
    public Student(String name, String grade, String bd, float gpa) {
        this.id ="B20DCCN"+String.format("%03d",cnt ++);
        this.name = name;
        this.grade = grade;
        this.bd = bd;
        this.gpa = gpa;
    }

    public String formatName() {
         String[] s =this.name.split("\\s+");
         String res ="";
        for(String i : s){
            res+=i.substring(0,1).toUpperCase()+i.substring(1).toLowerCase()+" ";
        }
        
        return res.substring(0,res.length()-1);
    }
    public String formatBd(){
        StringBuilder sb =new StringBuilder(this.bd);
        if(sb.charAt(1)=='/') sb.insert(0, "0");
        if(sb.charAt(4)=='/') sb.insert(3, "0");
        return sb.toString();
    }

    public Float getGpa() {
        return gpa;
    }
    
    @Override
    public int compareTo(Student other){
        return other.getGpa().compareTo(this.getGpa());
        
    }
    public String toString(){
        return id+" "+formatName()+" "+grade+" "+formatBd()+" "+String.format("%.2f",gpa);
    }
}
