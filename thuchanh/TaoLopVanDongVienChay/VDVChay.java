package thuchanh.TaoLopVanDongVienChay;

import java.util.Scanner;

public class VDVChay extends VanDongVien implements IVanDongVien {

    private int culy, soHuyChuong;

    public VDVChay() {
    }

    public VDVChay(String ma, String ten, double luong, int culy, int soHuyChuong) {
        super(ma, ten, luong);
        this.culy = culy;
        this.soHuyChuong = soHuyChuong;
    }

    public void input(Scanner in) {
        String ma = in.nextLine();
        if (!isMa(ma)) {
            System.out.println("nhap sai");
            //return;
        }
        setMa(ma);
        String ten = in.nextLine();
        setTen(ten);
        double luong = Double.parseDouble(in.nextLine());
        setLuong(luong);
        String s = in.nextLine();
        if (!isSo(s)) {
            System.out.println("nhap sai");
            //return;
        }
        culy = Integer.parseInt(s);
        String s2 = in.nextLine();
        if(isSo(s2)){
            System.out.println("nhap sai");
            //return;
        }
        soHuyChuong=Integer.parseInt(s2);
    }

    @Override
    public boolean isMa(String string) {
        String s = "VDVC-\\d{3}$";
        return string.matches(s);
    }

    @Override
    public boolean isSo(String string) {
        try {
            int number = Integer.parseInt(string);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }

    }

    @Override
    public double getLuongThucLinh() {
        if (soHuyChuong >= 4) {
            return getLuong() * 2 + 100 * soHuyChuong;
        } else if (soHuyChuong >= 1) {
            return getLuong() + soHuyChuong * 100;
        } else {
            return getLuong();
        }
    }
    public String toString(){
        return getMa()+" "+getTen()+" "+soHuyChuong+" "+getLuongThucLinh();
    }
}
