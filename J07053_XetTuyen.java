
import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

class XetTuyen {

    private String id, name;
    private Date ngay;
    private double lyThuyet, thucHanh;
    private static int cnt = 1;

    public XetTuyen(String name, Date ngay, double lyThuyet, double thucHanh) {
        this.name = name;
        this.ngay = ngay;
        this.lyThuyet = lyThuyet;
        this.thucHanh = thucHanh;
        this.id = "PH" + String.format("%02d", cnt++);
    }

    public void chuanHoaName() {
        String res[] = name.split("\\s+");
        String ans = "";
        for (String i : res) {
            ans += i.substring(0, 1).toUpperCase() + i.substring(1).toLowerCase() + " ";
        }
        name = ans;
    }

    public int tuoi() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String s = sdf.format(ngay);
        int year = Integer.parseInt(s.substring(6));
        return 2021 - year;
    }

    public double diemThuong() {
        if (lyThuyet < 7.5 || thucHanh < 7.5) {
            return 0;
        }
        if (lyThuyet < 8 || thucHanh < 8) {
            return 0.5;
        }
        return 1;
    }

    public double diemXepLoai() {
        double x= ((lyThuyet + thucHanh) / 2 + diemThuong());
        if(x>10) return 10;
        else return Math.round(x);
    }

    public String xepLoai() {
        
        if (diemXepLoai() < 5) {
            return "Truot";
        } else if (diemXepLoai() <= 6) {
            return "Trung binh";
        } else if (diemXepLoai() <= 7) {
            return "Kha";
        } else if (diemXepLoai() <= 8) {
            return "Gioi";
        } else {
            return "Xuat sac";
        }
    }

    public String toString() {
        chuanHoaName();
        return id + " " + name + tuoi() + " "
                + Math.round(diemXepLoai()) + " " + xepLoai();
    }
}

public class J07053_XetTuyen {

    public static void main(String[] args) throws ParseException, FileNotFoundException {
        Scanner sc = new Scanner(new File("XETTUYEN.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<XetTuyen> list = new ArrayList<>();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        while (n-- > 0) {
            String name = sc.nextLine().trim();
            Date ngay = sdf.parse(sc.nextLine());
            double lt = Double.parseDouble(sc.nextLine());
            double th = Double.parseDouble(sc.nextLine());
            XetTuyen xt = new XetTuyen(name, ngay, lt, th);
            list.add(xt);
        }
        for (XetTuyen i : list) {
            System.out.println(i);
        }
    }
}
