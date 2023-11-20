/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thuchanh;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class DiaChiEmail {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner ip = new Scanner(new File("DANHSACH.in"));
        int n = ip.nextInt();
        ip.nextLine();
        ArrayList<String> ds =new ArrayList<>();
        while(n-- >0){
            String [] a =ip.nextLine().trim().toLowerCase().split("\\s+");
            String s=a[a.length-1];
            for(int i=0;i<a.length-1;i++){
                s+=a[i].charAt(0);
            }
            ds.add(s);
            int cnt=Collections.frequency(ds, s);
            s+=(cnt==1 ? "" : cnt) +"@ptit.edu.vn";
            System.out.println(s);
        }
    }
}
