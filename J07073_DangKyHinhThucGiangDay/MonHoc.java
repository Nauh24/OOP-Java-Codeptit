
package J07073_DangKyHinhThucGiangDay;

public class MonHoc implements Comparable<MonHoc>{
    private String id,name;
    private int soTin;
    private String lt,th;

    public MonHoc(String id, String name, int soTin, String lt, String th) {
        this.id = id;
        this.name = name;
        this.soTin = soTin;
        this.lt = lt;
        this.th = th;
    }

    @Override
    public int compareTo(MonHoc o) {
        return id.compareTo(o.id);
    }

    public String getTh() {
        return th;
    }
    public String toString(){
        return id+" "+name+" "+soTin+" "+lt+" "+th;
    }
}
