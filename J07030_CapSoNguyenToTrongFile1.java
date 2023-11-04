
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
public class J07030_CapSoNguyenToTrongFile1 {
    static boolean isPrime(int n){
        if(n<2) return false;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0) return false;
        }
        return true;
    }
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream ois1=new ObjectInputStream(new FileInputStream("DATA1.in"));
        ArrayList<Integer> list1=(ArrayList<Integer>) ois1.readObject();
        TreeSet<Integer> ts1=new TreeSet<>();
        for(int i: list1){
            if(isPrime(i)){
                ts1.add(i);
            }
        }
        ObjectInputStream ois2=new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> list2=(ArrayList<Integer>) ois2.readObject();
        TreeSet<Integer> ts2=new TreeSet<>();
        for(int i: list2){
            if(isPrime(i)){
                ts2.add(i);
            }
        }
        int tong=1000000;
        for(Integer i : ts1){
            if(i*2>=tong){
                break;
            }
            if(ts2.contains(tong-i)){
                System.out.println(i+" "+(tong-i));
            }
        }
    }
}
