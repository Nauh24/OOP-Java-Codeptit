/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05067_QuanLyKhoXangDau;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<DonHang> list=new ArrayList<>();
        while(n-- >0){
            DonHang dh=new DonHang(sc.next(), sc.nextInt());
            list.add(dh);
        }
        for(DonHang i:list){
            System.out.println(i);
        }
    }
}
/*
3
N89BP 4500
D00BP 3500
X92SH 2600
*/