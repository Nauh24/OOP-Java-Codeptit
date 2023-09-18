
package J05011_TinhGio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        ArrayList<Player> list =new ArrayList<>(n);
        while (n -- >0){
            String id =sc.nextLine();
            String name =sc.nextLine();
            String in =sc.nextLine();
            String out =sc.nextLine();
            Player p =new Player(id, name, in, out);
            list.add(p);
        }
        Collections.sort(list);
        for(Player i : list){
            System.out.println(i);
        }
    }
}
/*
3
01T
Nguyen Van An
09:00
10:30
06T
Hoang Van Nam
15:30
18:00
02I
Tran Hoa Binh
09:05
10:00
*/