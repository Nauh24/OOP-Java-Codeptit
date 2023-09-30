
package J05030_BangDiemThanhPhan1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        ArrayList<Student> list =new ArrayList<>(n);
        while(n-- >0){
            String id=sc.nextLine();
            String name =sc.nextLine();
            String className =sc.nextLine();
            float d1=Float.parseFloat(sc.nextLine());
            float d2=Float.parseFloat(sc.nextLine());
            float d3=Float.parseFloat(sc.nextLine());
            Student st =new Student(id, name, className, d1, d2, d3);
            list.add(st);
        }
        Collections.sort(list);
        int cnt=1;
        for(Student i : list){
            System.out.println(cnt+" "+i);
            cnt++;
        }
    }
}
/*
3
B20DCCN999
Nguyen Van An
D20CQCN04-B
10.0
9.0
8.0
B20DCAT001
Le Van Nam
D20CQAT02-B
6.0
6.0
4.0
B20DCCN111
Tran Hoa Binh
D20CQCN04-B
9.0
5.0
6.0
*/