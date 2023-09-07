
package J04006_KhaiBaoLopSinhVien;

public class Student {
    private String id;
    private String name,grade,bird ;
    private float gpa;

    public Student() {
        this.id="";
        this.name =this.grade=this.bird="";
        this.gpa=0;
    }

    public Student(String id, String name, String grade, String bird, float gpa) {
        this.id = id;
        this.name = name;
        this.grade = grade;
        this.bird = bird;
        this.gpa = gpa;
    }

   
    public void formatBird(){
        StringBuilder sb =new StringBuilder(this.bird);
        if(sb.charAt(1)=='/'){
            sb.insert(0, "0");
        }
        if(sb.charAt(4)=='/'){
            sb.insert(3,"0");
        }
        this.bird=sb.toString();
        
    }
    public String toString(){
        return this.id+" "+this.name+" "+this.grade+" "+this.bird+" "+String.format("%.2f",this.gpa);
    }
public void display(){
    formatBird();
    System.out.println(this.id+" "+this.name+" "+this.grade+" "+this.bird+" ");
    System.out.printf("%.2f",this.gpa);
}
    
}
