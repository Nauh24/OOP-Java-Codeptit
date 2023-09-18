
package J05018_BangDiemHocSinh;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        ArrayList<HocSinh> list =new ArrayList<>(n);
        while (n -- >0){
            String name =sc.nextLine();
            float[] d =new float[10];
            for(int i=0;i<10;i++){
                d[i]=sc.nextFloat();
            }
            HocSinh hs =new HocSinh(name, d);
            list.add(hs);
            //sc.nextLine();
        }
        Collections.sort(list);
        for (HocSinh i : list){
            System.out.println(i);
        }
    }
}
/*
3
Luu Thuy Nhi
9.3  9.0  7.1  6.5  6.2  6.0  8.2  6.7  4.8  5.5
Le Van Tam
8.0  8.0  5.5  9.0  6.8  9.0  7.2  8.3  7.2  6.8
Nguyen Thai Binh
9.0  6.4  6.0  7.5  6.7  5.5  5.0  6.0  6.0  6.0
*/