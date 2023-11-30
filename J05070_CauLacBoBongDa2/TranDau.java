/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05070_CauLacBoBongDa2;


/**
 *
 * @author Admin
 */
public class TranDau implements Comparable<TranDau>{
    private String id;
    private CLB clb;
    private Integer total;

    public TranDau(String id, CLB clb, int soLuong) {
        this.id = id;
        this.clb = clb;
        this.total = clb.getGiaVe()*soLuong;
    }
    public String toString(){
        return id+" "+clb.getName()+" "+total;
    }

    @Override
    public int compareTo(TranDau o) {
        if(total.compareTo(o.total)==0){
            return clb.getName().compareTo(o.clb.getName());
        }
        else return o.total.compareTo(total);
    }
}
