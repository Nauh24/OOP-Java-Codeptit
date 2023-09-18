
package J05006_DanhSachDoiTuongNhanVien;

public class NhanVien {
    private String id ,name ,sex ,bd ,add ,msThue ,dateKi ;
    static int cnt=1;

    public NhanVien( String name, String sex, String bd, String add, String msThue, String dateKi) {
        this.id =String.format("%05d", cnt++);
        this.name = name;
        this.sex = sex;
        this.bd = bd;
        this.add = add;
        this.msThue = msThue;
        this.dateKi = dateKi;
    }
    public String toString(){
        return id+" "+name+" "+sex+" "+bd+" "+add +" "+msThue+" "+dateKi;
    }
}
