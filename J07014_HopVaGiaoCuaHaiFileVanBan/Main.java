/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J07014_HopVaGiaoCuaHaiFileVanBan;

import java.io.IOException;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) throws IOException {
        WordSet s1 = new WordSet("src/DATA1.in");
        WordSet s2 = new WordSet("src/DATA2.in");
        System.out.println(s1.union(s2));
        System.out.println(s1.intersection(s2));
    }
}
