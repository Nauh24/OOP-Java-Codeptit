/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thuchanh;

import java.util.Scanner;

class DichVu {

    private String ma;
    private String ten;
    private String soDienThoai;

    public DichVu() {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         * 4: return
         *  */
        // </editor-fold>
    }

    public DichVu(String ma, String ten, String soDienThoai) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         * 4: aload_0
         * 5: aload_1
         * 6: putfield      #2                  // Field ma:Ljava/lang/String;
         * 9: aload_0
         * 10: aload_2
         * 11: putfield      #3                  // Field ten:Ljava/lang/String;
         * 14: aload_0
         * 15: aload_3
         * 16: putfield      #4                  // Field soDienThoai:Ljava/lang/String;
         * 19: return
         *  */
        // </editor-fold>
    }

    public String getMa() {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: getfield      #2                  // Field ma:Ljava/lang/String;
         * 4: invokevirtual #5                  // Method java/lang/String.toUpperCase:()Ljava/lang/String;
         * 7: areturn
         *  */
        // </editor-fold>
    }

    public void setMa(String ma) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: aload_1
         * 2: invokevirtual #5                  // Method java/lang/String.toUpperCase:()Ljava/lang/String;
         * 5: putfield      #2                  // Field ma:Ljava/lang/String;
         * 8: return
         *  */
        // </editor-fold>
    }

    public String getTen() {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: getfield      #3                  // Field ten:Ljava/lang/String;
         * 4: areturn
         *  */
        // </editor-fold>
    }

    public void setTen(String ten) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: aload_1
         * 2: putfield      #3                  // Field ten:Ljava/lang/String;
         * 5: return
         *  */
        // </editor-fold>
    }

    public String getSoDienThoai() {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: getfield      #4                  // Field soDienThoai:Ljava/lang/String;
         * 4: areturn
         *  */
        // </editor-fold>
    }

    public void setSoDienThoai(String soDienThoai) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: aload_1
         * 2: putfield      #4                  // Field soDienThoai:Ljava/lang/String;
         * 5: return
         *  */
        // </editor-fold>
    }
}

interface IDichVu {

    public boolean isMa(String string);

    public boolean isDienThoai(String string);

    public double getTienNop();
}
class DVDien extends DichVu implements IDichVu{
    private int thang;
    private int sokw;
    
    public DVDien() {
    }
    public void input(Scanner sc){
        String s="(hn|da)\\d{2}t\\d{2}";
        String ma=sc.nextLine();
        while(!ma.matches(s)){
            System.out.println("nhap sai");
        }
        String name=sc.nextLine();
        int soThang=Integer.parseInt(sc.nextLine());
        String s2="0\\d{9}";
        String sdt=sc.nextLine();
        
    }
    @Override
    public boolean isMa(String string) {
    }

    @Override
    public boolean isDienThoai(String string) {
    }

    @Override
    public double getTienNop() {
    }
    
}
public class TaoLopDichVuDien {
    public static void main(String[] args) {
        DVDien a=new DVDien();
        Scanner in=new Scanner(System.in);
        a.input(in);
        System.out.println(a);
    }
}
