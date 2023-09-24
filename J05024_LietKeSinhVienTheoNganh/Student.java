package J05024_LietKeSinhVienTheoNganh;
public class Student {
    private String id,name,className,email;

    public Student(String id, String name, String className, String email) {
        this.id = id;
        this.name = name;
        this.className = className;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public String getClassName() {
        return className;
    }

    public String getId2() {
        return id.substring(3,7);
    }
    
    public String toString(){
        return id+" "+name+" "+className+" "+email;
    }
}
/*
       
*/