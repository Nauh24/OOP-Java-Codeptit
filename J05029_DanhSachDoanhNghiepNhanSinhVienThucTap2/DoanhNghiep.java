
package J05029_DanhSachDoanhNghiepNhanSinhVienThucTap2;

public class DoanhNghiep implements Comparable<DoanhNghiep>{
    private String id ,name ;
    private Integer number;

    public DoanhNghiep(String id, String name, Integer number) {
        this.id = id;
        this.name = name;
        this.number = number;
    }
    public String toString(){
        return id +" "+name+" "+number;
    }

    public Integer getNumber() {
        return number;
    }

    @Override
    public int compareTo(DoanhNghiep o) {
        if(this.number.compareTo(o.number)==0){
            return this.id.compareTo(o.id);
        }
        else return o.number.compareTo(this.number);
    }
    
}
