package J04013_BaiToanTuyenSinh;

public class ThiSinh {

    private String id, name;
    private double toan, ly, hoa;

    public ThiSinh(String id, String name, double toan, double ly, double hoa) {
        this.id = id;
        this.name = name;
        this.toan = toan;
        this.ly = ly;
        this.hoa = hoa;
    }

    public double diemUuTien() {
        switch (id.charAt(2)) {
            case '1':
                return 0.5;
            case '2':
                return 1;
            case '3':
                return 2.5;
           
        }
        return 0;
    }

    public double tongDiem() {
        return toan*2 + ly + hoa;
    }

    public boolean status() {
        if (tongDiem()+diemUuTien() >= 24) {
            return true;
        } else {
            return false;
        }
    }

    public String toString() {
        String res =id+" "+name+" ";
        if(diemUuTien()==(int)diemUuTien()) res+=String.format("%.0f",diemUuTien());
        else res+=String.format("%.1f",diemUuTien());
        res+=" ";
        if(tongDiem()==(int)tongDiem()) res+=String.format("%.0f",tongDiem());
        else res+=String.format("%.1f",tongDiem());
        res+=" "+(status()?"TRUNG TUYEN":"TRUOT");
        return res;
    }
}
