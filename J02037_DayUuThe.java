
import java.util.Scanner;


public class J02037_DayUuThe {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        while(t -- >0){
            String s=sc.nextLine();
            String[] a =s.split(" ");
            int chan=0,le=0,n=a.length;
            for(int i=0;i<n;i++){
                if(a[i].charAt(a[i].length()-1)%2==0) chan++;
                else le++;
            }
            if((n%2==0&&chan>le)||(n%2==1&&le>chan)) System.out.println("YES");
            else System.out.println("NO");
        }
    }     
}
