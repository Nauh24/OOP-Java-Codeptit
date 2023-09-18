
package J05009_TimThuKhoaCuaKyThi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n =Integer.parseInt(sc.nextLine());
        ArrayList<ThiSinh> list =new ArrayList<>(n);
        while (n -- >0){
            String name =sc.nextLine();
            String bd =sc.nextLine();
            float d1 =Float.parseFloat(sc.nextLine());
            float d2 =Float.parseFloat(sc.nextLine());
            float d3 =Float.parseFloat(sc.nextLine());
            ThiSinh ts =new ThiSinh(name, bd, d1, d2, d3);
            list.add(ts);
        }
        Collections.sort(list);
        float maxx = list.get(0).tongDiem();
        for(ThiSinh i : list){
            if(i.tongDiem()==maxx){
                System.out.println(i);
            }
            else break;
        }
    }
}
/*
3
Nguyen Van A
12/12/1994
3.5
7.0
5.5
Nguyen Van B
1/9/1994
7.5
9.5
9.5
Nguyen Van C
6/7/1994
8.5
9.5
8.5

*/