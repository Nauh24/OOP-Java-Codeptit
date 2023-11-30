/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05070_CauLacBoBongDa2;

import J05069_CauLacBoBongDa1.*;

/**
 *
 * @author Admin
 */
public class CLB {
    String id;
    private String name;
    private int giaVe;

    public CLB(String id, String name, int giaVe) {
        this.id = id;
        this.name = name;
        this.giaVe = giaVe;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getGiaVe() {
        return giaVe;
    }
    
}
