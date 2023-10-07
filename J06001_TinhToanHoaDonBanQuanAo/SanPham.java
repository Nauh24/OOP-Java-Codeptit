
package J06001_TinhToanHoaDonBanQuanAo;

public class SanPham {
    private String id,name;
    private long donGiaLoai1,donGiaLoai2;

    public SanPham(String id, String name, long donGiaLoai1, long donGiaLoai2) {
        this.id = id;
        this.name = name;
        this.donGiaLoai1 = donGiaLoai1;
        this.donGiaLoai2 = donGiaLoai2;
    }

    

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public long getDonGiaLoai1() {
        return donGiaLoai1;
    }

    public long getDonGiaLoai2() {
        return donGiaLoai2;
    }
    
}
