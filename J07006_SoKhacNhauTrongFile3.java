
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class J07006_SoKhacNhauTrongFile3 {
    public static void main(String[] args) throws IOException, ClassNotFoundException{
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<Integer> a =(ArrayList<Integer>) ois.readObject();
        int[] f=new int[1000];
        for(int i:a){
            f[i]++;
        }
        for(int i=0;i<1000;i++){
            if(f[i]>0 ) System.out.println(i+" "+f[i]);
        }
    } 
}
