
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.TreeSet;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class J07031_CapSoNguyenToTrongFile2 {
    static boolean isPrime(int n){
        if(n<2) return false;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0) return false;
        }
        return true;
    }
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream ois1 =new ObjectInputStream(new FileInputStream("DATA1.in"));
        ArrayList<Integer> list1=(ArrayList<Integer>) ois1.readObject();
        TreeSet<Integer> ts1 =new TreeSet<>();
        for(Integer i : list1){
            if(isPrime(i)){
                ts1.add(i);
            }
        }
        ObjectInputStream ois2 =new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> list2=(ArrayList<Integer>) ois2.readObject();
       // TreeSet<Integer> ts2 =new TreeSet<>();
       int tong=1000000;
       for(Integer i : ts1){
           Integer i2=tong-i;
           if(i>=i2 ) break;
           if(ts1.contains(i2)&&!list2.contains(i)&&!list2.contains(i2)){
               System.out.println(i+" "+i2);
           }
       }
    }
}
