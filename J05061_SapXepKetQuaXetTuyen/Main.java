/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05061_SapXepKetQuaXetTuyen;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main {
     public static void main(String[] args) throws ParseException {
        Scanner sc =new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        SimpleDateFormat sdf =new SimpleDateFormat("dd/MM/yyyy");
        ArrayList<Person> list=new ArrayList<>(n);
        while (n-- > 0){
            String name =sc.nextLine();
            Date bd=sdf.parse(sc.nextLine());
            double lyThuyet=Double.parseDouble(sc.nextLine());
            double thucHanh=Double.parseDouble(sc.nextLine());
            Person p =new Person(name, bd, lyThuyet, thucHanh);
            list.add(p);
        }
         Collections.sort(list);
        for(Person i :list){
            System.out.println(i);
        }
    }
}
/*
3
Doan Thi Kim
13/03/1982
8
9.5
Dinh Thi Ngoc Ha
03/09/1996
6.5
8
Tran Thanh Mai
12/09/2004
8
9
*/