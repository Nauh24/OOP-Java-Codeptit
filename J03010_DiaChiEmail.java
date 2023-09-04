package codeptit;

import java.util.*;

public class J03010_DiaChiEmail {

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();
        ip.nextLine();
        ArrayList<String> ds =new ArrayList<>();
        while(n-- >0){
            String [] a =ip.nextLine().trim().toLowerCase().split("\\s+");
            String s=a[a.length-1];
            for(int i=0;i<a.length-1;i++){
                s+=a[i].charAt(0);
            }
            ds.add(s);
            int cnt=Collections.frequency(ds, s);
            s+=(cnt==1 ? "" : cnt) +"@ptit.edu.vn";
            System.out.println(s);
        }
    }

}
