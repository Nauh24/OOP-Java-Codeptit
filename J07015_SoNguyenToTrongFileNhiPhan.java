
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class J07015_SoNguyenToTrongFileNhiPhan {

    static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("SONGUYEN.in"));
        ArrayList<Integer> a = (ArrayList<Integer>) ois.readObject();
        HashMap<Integer, Integer> m = new HashMap<>();
        ArrayList<Integer> key = new ArrayList<>();
        for (Integer i : a) {
            if (m.containsKey(i)) {
                m.put(i, m.get(i) + 1);
            } else {
                if (isPrime(i)) {
                    m.put(i, 1);
                    key.add(i);
                }
            }
        }
        Collections.sort(key);
        for (Integer i : key) {
            System.out.println(i + " " + m.get(i));
        }

    }
}
