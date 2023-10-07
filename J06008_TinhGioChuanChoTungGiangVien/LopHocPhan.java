
package J06008_TinhGioChuanChoTungGiangVien;

public class LopHocPhan {
    private String maGiangVien,maMonHoc;
    private double gioChuan;

    public LopHocPhan(String maGiangVien, String maMonHoc, double gioChuan) {
        this.maGiangVien = maGiangVien;
        this.maMonHoc = maMonHoc;
        this.gioChuan = gioChuan;
    }

    public String getMaGiangVien() {
        return maGiangVien;
    }

    public String getMaMonHoc() {
        return maMonHoc;
    }

    public double getGioChuan() {
        return gioChuan;
    }
    
}
