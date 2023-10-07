
package J06001_TinhToanHoaDonBanQuanAo;

public class HoaDon {
    private String maHoaDon;
    private SanPham sp;
    private int soLuongMua;
    private static int cnt=1;
    public HoaDon(String maHoaDon, SanPham sp, int soLuongMua) {
        this.maHoaDon = maHoaDon+String.format("-%03d",cnt++);
        this.sp = sp;
        this.soLuongMua = soLuongMua;
    }
    public String tenSanPham(){
        return sp.getName();
    }
    public long thanhTien(){
        if(maHoaDon.charAt(2)=='1'){
            return soLuongMua*sp.getDonGiaLoai1();
        }
        else return soLuongMua*sp.getDonGiaLoai2();
    }
    public long giamGia(){
        if(soLuongMua>=150){
            return (long) (0.5*thanhTien());
        }
        else if(soLuongMua>=100){
            return (long) (0.3*thanhTien());
        }
        else if(soLuongMua>=50){
            return (long) (0.15*thanhTien());
        }
        else return 0;
    }
    public long tongTien(){
        return thanhTien()-giamGia();
    }
    public String toString(){
        return maHoaDon+" "+tenSanPham()+" "+giamGia()+" "+tongTien();
    }
}
