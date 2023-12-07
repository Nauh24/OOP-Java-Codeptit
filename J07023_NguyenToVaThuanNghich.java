
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.TreeSet;

public class J07023_NguyenToVaThuanNghich {

    public static boolean f[] = new boolean[10000];

    public static void sieve() {
        for (int i = 0; i < 10000; i++) {
            f[i] = true;
        }
        f[0] = f[1] = false;
        for (int i = 2; i < Math.sqrt(10000); i++) {
            if (f[i]) {
                for (int j = i * i; j < 10000; j += i) {
                    f[j] = false;
                }
            }
        }
    }

    public static boolean thuanNghich(int n) {
        int tmp = n;
        int s = 0;
        while (n > 0) {
            s = s * 10 + n % 10;
            n /= 10;
        }
        return tmp == s;
    }

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream ois1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ArrayList<Integer> list1 = (ArrayList<Integer>) ois1.readObject();
        ObjectInputStream ois2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> list2 = (ArrayList<Integer>) ois2.readObject();
        int d1[] = new int[10000];
        int d2[] = new int[10000];
        for(int i:list1) d1[i]+=1;
        for(int i:list2) d2[i]+=1;
   
        sieve();
        for(int i=2;i<10000;i++){
            if(f[i]&&thuanNghich(i)&&d1[1]!=0 && d2[i]!=0){
                System.out.println(i+" "+d1[i]+" "+d2[i]);
            }
        }
    }
}
