/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thuchanh;
/* Author: NgTienHungg */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.TreeSet;

public class TH_GhepMa {

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream ois1 = new ObjectInputStream(new FileInputStream("DATA1.txt"));
        ArrayList<String> al1 = (ArrayList<String>) ois1.readObject();
        TreeSet<String> ts1 = new TreeSet(al1);

        ObjectInputStream ois2 = new ObjectInputStream(new FileInputStream("DATA2.txt"));
        ArrayList<Integer> al2 = (ArrayList<Integer>) ois2.readObject();
        TreeSet<Integer> ts2 = new TreeSet(al2);

        for (String i : ts1) {
            for (Integer j : ts2) {
                System.out.println(i + j);
            }
        }
    }
}
