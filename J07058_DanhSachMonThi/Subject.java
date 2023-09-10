
package J07058_DanhSachMonThi;

public class Subject implements Comparable<Subject>{
    private String id ,name ,hinhThuc ;

    public Subject(String id, String name, String hinhThuc) {
        this.id = id;
        this.name = name;
        this.hinhThuc = hinhThuc;
    }

    public String getId() {
        return id;
    }
    public String toString(){
        return id+" "+name+" "+hinhThuc;
    }
    public int compareTo(Subject other){
        return this.id.compareTo(other.id);
    }
}
