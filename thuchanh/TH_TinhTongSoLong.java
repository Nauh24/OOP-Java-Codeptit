/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thuchanh;
/* Author: NgTienHungg */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TH_TinhTongSoLong {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA1.txt"));
        long sum = 0;
        while (sc.hasNext()) {
            String s = sc.next();
            try {
                int x = Integer.parseInt(s);
            } catch (NumberFormatException ex) {
                try {
                    long y = Long.parseLong(s);
                    sum += y;
                } catch (NumberFormatException ex2) {

                }
            }
        }
        System.out.println(sum);
    }
}