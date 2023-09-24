
package J05023_LietKeSinhVienTheoKhoa;

public class Student {
    private String id ,name ,className ,email;

    public Student(String id, String name, String className, String email) {
        this.id = id;
        this.name = name;
        this.className = className;
        this.email = email;
    }
    public String getYear(){
        return this.className.substring(1,3);
    }
    public String toString(){
        return id +" "+name+" "+className+" "+email;
    }
}
