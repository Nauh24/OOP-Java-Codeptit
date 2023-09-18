
package J05010_SapXepDanhSachMatHang;

public class MatHang implements Comparable<MatHang>{
    private int id;
    private String name ,group ;
    private double buyCost ,sellCost;
    static int cnt=1;

    public MatHang( String name, String group, double buyCost, double sellCost) {
        this.id = cnt++;
        this.name = name;
        this.group = group;
        this.buyCost = buyCost;
        this.sellCost = sellCost;
    }
    public Double profit(){
        return sellCost-buyCost;
    } 
    public String toString(){
        return id+" "+name+" "+group+" "+String.format("%.2f", profit());
    }
    public int compareTo(MatHang o){
        return o.profit().compareTo(this.profit());
    }
}
