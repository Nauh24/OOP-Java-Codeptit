
package J07058_DanhSachMonThi;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
public class Main {
    public static void main(String[] args)throws IOException{
        Scanner sc =new Scanner(new File("DATA.txt"));
        int t=Integer.parseInt(sc.nextLine());
        ArrayList<Subject> list =new ArrayList<>(); 
        while(t -->0){
              String id =sc.nextLine();
        String name =sc.nextLine();
        String hinhThuc =sc.nextLine();
        Subject mh =new Subject(id, name, hinhThuc);
        list.add(mh);
        }
        Collections.sort(list);
        for(Subject i :list){
            System.out.println(i);
        }
    }
}
