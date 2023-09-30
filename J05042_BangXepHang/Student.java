
package J05042_BangXepHang;

public class Student implements Comparable<Student>{
    private String name ;
    private Integer ac,submit;

    public Student(String name, int ac, int submit) {
        this.name = name;
        this.ac = ac;
        this.submit = submit;
    }

    @Override
    public int compareTo(Student o) {
       if(this.ac.compareTo(o.ac)!=0){
           return -ac.compareTo(o.ac);
       }
       else if(this.submit.compareTo(o.submit)!=0){
           return this.submit.compareTo(o.submit);
       }
       else return this.name.compareTo(o.name);
    }
    public String toString(){
        return name+" "+ac+" "+submit;
    }
}
