
package J05031_BangDiemThanhPhan2;

public class Student implements Comparable<Student>{
    private String id ,name ,className ;
    private float d1,d2,d3;

    public Student(String id, String name, String className, float d1, float d2, float d3) {
        this.id = id;
        this.name = name;
        this.className = className;
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
    }
    public String toString(){
        return id+" "+name+" "+className+" "+String.format("%.1f",d1)+" "+String.format("%.1f",d2)+" "+String.format("%.1f",d3);
    }

    @Override
    public int compareTo(Student o) {
        return this.name.compareTo(o.name);
    }
}
