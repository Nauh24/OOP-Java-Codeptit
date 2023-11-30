
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;
public class J07076_SapXepMaTran {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc=new Scanner(new File("src/MATRIX.in"));
        int t=sc.nextInt();
        while(t -- >0){
            int n=sc.nextInt();
            int m=sc.nextInt();
            int p=sc.nextInt();
            int[][] a=new int[n][m];
            Vector<Integer> v=new Vector<>();
            for(int i=0 ;i<n;i++){
                for(int j=0;j<m;j++){
                    a[i][j]=sc.nextInt();
                    if(j==p-1) v.add(a[i][j]);
                }
            }
            Collections.sort(v);
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    if(j==p-1){
                        System.out.print(v.get(i)+" ");
                    }
                    else{
                        System.out.print(a[i][j]+" ");
                    }
                }
                System.out.println();
            }
        }
    }
}
