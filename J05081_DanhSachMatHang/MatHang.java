
package J05081_DanhSachMatHang;

public class MatHang {
    private String id ,name ,unit ;
    private int buyPrice,sellPrice;
    private static int cnt=1;

    public MatHang( String name, String unit, int buyPrice, int sellPrice) {
        this.id ="MH"+String.format("%03d",cnt++ );
        this.name = name;
        this.unit = unit;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }
    public int getProfit(){
        return sellPrice-buyPrice;
    }
    public String toString(){
        return id+" "+name+" "+unit+" "+buyPrice+" "+sellPrice+" "+getProfit();
    }
}
