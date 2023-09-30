
package J05042_BangXepHang;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner sc =new Scanner(System.in);
       int n=Integer.parseInt(sc.nextLine());
        ArrayList<Student> list =new ArrayList<>(n);
       while(n-- >0){
           String name=sc.nextLine();
           int ac=sc.nextInt();
           int submit=sc.nextInt();
           sc.nextLine();
           Student st =new Student(name, ac, submit);
           list.add(st);
       }
        Collections.sort(list);
        for(Student i : list){
            System.out.println(i);
        }
    }
}
/*
2
Nguyen Van Nam
168 600
Tran Thi Ngoc
168 600
*/