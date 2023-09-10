
package J04018_SoPhuc;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int t=sc.nextInt();
        while(t -- >0){
            SoPhuc A =new SoPhuc(sc.nextInt(), sc.nextInt());
            SoPhuc B =new SoPhuc(sc.nextInt(), sc.nextInt());
            SoPhuc C=A.add(B);
            
            SoPhuc D=C.mul(A);
            SoPhuc E=C.mul(C);
            System.out.println(D+", "+E);
        }
    }
}
