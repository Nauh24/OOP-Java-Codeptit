
import java.util.Scanner;

class Matran {
    private int[][] a;
    private int n;

    public Matran(int n) {
        this.n = n;
        this.a = new int[n][n];
    }

    public Matran(int[][] a) {
        this.a = a;
        this.n = a.length;
    }

    public int[][] getMatran() {
        return a;
    }

    public int getKT() {
        return n;
    }

    public void input(Scanner in) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = in.nextInt();
            }
        }
    }

    public void out() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    public Matran hieu(int[][] b) {
        int[][] result = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = a[i][j] - b[i][j];
            }
        }
        return new Matran(result);
    }
}

public class Main_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Matran m = new Matran(n);
        
        // Nhập ma trận A
        m.input(sc);
        
        Matran b = new Matran(m.getKT());
        
        // Nhập ma trận B
        b.input(sc);
        
        // Tính hiệu ma trận
        Matran t = m.hieu(b.getMatran());
        
        // Xuất ra ma trận hiệu
        t.out();
    }
}
