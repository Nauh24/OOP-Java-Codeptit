/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05058_SapXepKetQuaTuyenSinh;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        ArrayList<ThiSinh> list=new ArrayList<>(n);
        while(n-- >0){
            String id=sc.nextLine();
            String name=sc.nextLine();
            double toan=Double.parseDouble(sc.nextLine());
            double ly=Double.parseDouble(sc.nextLine());
            double hoa=Double.parseDouble(sc.nextLine());
            ThiSinh ts=new ThiSinh(id, name, toan, ly, hoa);
            list.add(ts);
        }
        list.sort(Comparator.comparing(ThiSinh::tongDiem).reversed());
        for(ThiSinh i : list){
            System.out.println(i);
        }
    }
}
