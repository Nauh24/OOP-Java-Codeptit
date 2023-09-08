
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;


public class J07005_SoKhacNhauTrongFile2 {
    public static void main(String[] args)throws IOException{
        DataInputStream dis =new DataInputStream(new FileInputStream("DATA.IN"));
        
        int[] d=new int[1000];
        for(int i=0;i<100000;i++){
            d[dis.readInt()]++;
        }
        for(int i=0;i<1000;i++){
            if(d[i]>0) System.out.println(i+" "+d[i]);
        }
    }
}
