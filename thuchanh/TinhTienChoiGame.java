/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thuchanh;

/**
 *
 * @author Admin
 */
class Player{
    private String id,name,tenMay;
    String vao,ra;
    private int tien;
private static int cnt=1;
    public Player(String name, String tenMay, String vao, String ra, int tien) {
        this.name = name;
        this.tenMay = tenMay;
        this.vao = vao;
        this.ra = ra;
        this.tien = tien;
        this.id="KH"+String.format("%02d", cnt++);
    }
    public void chuanHoaName(){
        String [] s=name.split("\\s+");
        String ans="";
        for(String i: s){
            ans+=i.substring(0,1).toUpperCase()+i.substring(1).toLowerCase();
        }
    }
    
}
public class TinhTienChoiGame {
    
}
