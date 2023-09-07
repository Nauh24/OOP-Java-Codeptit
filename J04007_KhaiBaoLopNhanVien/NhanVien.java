
package J04007_KhaiBaoLopNhanVien;

public class NhanVien {
    private String id,name ,sex ,dateOfBird ,add ,msThue ,dateKi ;

    public NhanVien(String id, String name, String sex, String dateOfBird, String add, String msThue, String dateKi) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.dateOfBird = dateOfBird;
        this.add = add;
        this.msThue = msThue;
        this.dateKi = dateKi;
    }
    public String toString(){
        return this.id+" "+this.name+" "+this.sex+" "+this.dateOfBird+" "+this.add+" "+this.msThue+" "+this.dateKi;
    }
}
