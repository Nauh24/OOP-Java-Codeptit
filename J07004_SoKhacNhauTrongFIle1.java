
import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class J07004_SoKhacNhauTrongFIle1 {
    public static void main(String[] args)throws IOException{
          Scanner sc =new Scanner(new File("DATA.in"));
          int[] d =new int[1000];
          while(sc.hasNext()){
              d[sc.nextInt()]++;
          }
          for(int i=0;i<1000;i++){
              if(d[i]>0){ 
                  System.out.println(i+" "+d[i]);
              }
              
          }
    }
}
