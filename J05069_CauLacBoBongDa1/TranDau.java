/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05069_CauLacBoBongDa1;

/**
 *
 * @author Admin
 */
public class TranDau{
    private String id;
    private CLB clb;
    private int total;

    public TranDau(String id, CLB clb, int soLuong) {
        this.id = id;
        this.clb = clb;
        this.total = clb.getGiaVe()*soLuong;
    }
    public String toString(){
        return id+" "+clb.getName()+" "+total;
    }
}
