
package J05051_SapXepBangTinhTienDien;

public class KhachHang implements Comparable<KhachHang>{
    private String SD;
    private int chiSoCu,chiSoMoi;
    private String id ;
    private static int cnt=1;

    public KhachHang(String SD, int chiSoCu, int chiSoMoi) {
        this.SD = SD;
        this.chiSoCu = chiSoCu;
        this.chiSoMoi = chiSoMoi;
        this.id ="KH"+String.format("%02d",cnt++);
    }
    public int heSo(){
        switch (SD) {
            case "KD":
                    return 3;
            case "NN":
                return 5;
            case "TT" :
                return 4;
            case "CN":
                return 2;
            default: return 0;
        }
    }
    public int tien(){
        return (chiSoMoi-chiSoCu)*heSo()*550;
    }
    public int phuTroi(){
        if(chiSoMoi-chiSoCu>100){
            return tien();
        }
        else if(chiSoMoi-chiSoCu>=50){
            return (int) Math.round( tien()*0.35f);
        }
        else return 0;
    }
    public Integer  tongTien(){
        return phuTroi()+tien();
    }
    public String toString(){
        return id+" "+heSo()+" "+tien()+" "+phuTroi()+ " "+tongTien();
    }

    @Override
    public int compareTo(KhachHang o) {
        return o.tongTien().compareTo(this.tongTien());
    }
}
