/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05060_KetQuaXetTuyen;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
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
        for(Person i :list){
            System.out.println(i);
                    
        }
    }
}
