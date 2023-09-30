
package J05037_TinhGiaBan2;

public class MatHang implements Comparable<MatHang>{
    private String id ,name ,unit;
    private int unitCost,amount;
    private static int cnt=1;
    public MatHang( String name, String unit, int unitCost, int amount) {
        this.id ="MH"+String.format("%02d",cnt++);
        this.name = name;
        this.unit = unit;
        this.unitCost = unitCost;
        this.amount = amount;
    }
    public int shipCost(){
        return (int) Math.round(unitCost*amount*0.05);
    }
    public int totalCost(){
        return Math.round(unitCost*amount+shipCost());
    }
    public Integer sellCost(){
        return (int) Math.ceil(((((totalCost()+totalCost()*0.02)/amount)/100)))*100;
    }
    public String toString(){
        return id+" "+name+" "+unit+" "+shipCost()+" "+totalCost()+ " "+sellCost();
    }

    @Override
    public int compareTo(MatHang o) {
        return o.sellCost().compareTo(this.sellCost());
    }
    
}
