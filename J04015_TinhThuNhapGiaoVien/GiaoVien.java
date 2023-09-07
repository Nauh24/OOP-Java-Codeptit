
package J04015_TinhThuNhapGiaoVien;

public class GiaoVien {
    private String maNgach ,name ;
    private long salary ;

    public GiaoVien(String maNgach, String name, long salary) {
        this.maNgach = maNgach;
        this.name = name;
        this.salary = salary;
    }

    public String getMaNgach() {
        return maNgach;
    }

    
    public int heSo (){
        if(maNgach.charAt(2)=='0') return maNgach.charAt(3)-'0';
        else return Integer.parseInt(maNgach.substring(2));
    }
    public long phuCap(){
        String x =maNgach.substring(0,2);
        switch (x) {
            case "HT":
                return 2000000;
            case "HP":
                return 900000;
            case "GV":
                return 500000;
        }
        return 0;
    }
    public long thuNhap(){
        return salary*this.heSo()+this.phuCap();
    }
    public String toString(){
        return maNgach+" "+name+" "+this.heSo()+" "+this.phuCap()+" "+this.thuNhap();
    }
}
