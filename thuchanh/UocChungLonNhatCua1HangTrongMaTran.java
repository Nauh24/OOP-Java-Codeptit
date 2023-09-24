package thuchanh;
import java.util.Scanner;
public class UocChungLonNhatCua1HangTrongMaTran {
    public static int gcd(int a, int b) {
        if(b==0) return a;
        else return gcd(b,a%b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[][] a = new int[n][m];
            int[] b = new int[n]; 
            
            for (int i = 0; i < n; i++) {
                int res = 1;
                for (int j = 0; j < m; j++) {
                    a[i][j] = sc.nextInt();
                    res =gcd(res, a[i][j]);
                }
                b[i] = res; 
            }
            for (int i = 0; i < n; i++) {
                System.out.print(b[i] + " ");
            }
            System.out.println(); 
        }
    }
}
