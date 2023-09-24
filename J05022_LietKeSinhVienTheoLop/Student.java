
package J05022_LietKeSinhVienTheoLop;

public class Student {
    private String id ,name ,className ,email;

    public Student(String id, String name, String className, String email) {
        this.id = id;
        this.name = name;
        this.className = className;
        this.email = email;
    }

    public String getClassName() {
        return className;
    }
    public String toString(){
        return id+" "+name+" "+className+" "+email;
    }
}

