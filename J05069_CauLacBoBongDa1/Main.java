/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05069_CauLacBoBongDa1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        ArrayList<CLB> list1=new ArrayList<>();
        while(n-- >0){
            String id=sc.nextLine();
            String name=sc.nextLine();
            int giaVe=Integer.parseInt(sc.nextLine());
            CLB clb=new CLB(id, name, giaVe);
            list1.add(clb);
        }
        int m=sc.nextInt();
        ArrayList<TranDau> list2=new ArrayList<>();
        while(m-- >0){
            String id=sc.next();
            int soLuong=sc.nextInt();
            String code=id.substring(1,3);
            for(CLB i: list1){
                if(code.equals(i.getId())){
                    TranDau td=new TranDau(id, i, soLuong);
                    list2.add(td);
                    break;
                }
            }
        }
        for(TranDau i: list2){
            System.out.println(i);
        }
    }
}
/*
2
AC
AC Milan
12
MU
Manchester United
10
2
IAC1 80000
EMU2 60000
*/