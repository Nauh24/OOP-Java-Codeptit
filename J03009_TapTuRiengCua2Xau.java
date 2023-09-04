
package codeptit;


import java.util.*;

public class J03009_TapTuRiengCua2Xau {
    public static void main(String[] args) {
        Scanner ip =new Scanner(System.in);
        int t=ip.nextInt();
        ip.nextLine();
        while(t -- >0){
            String s1=ip.nextLine();
            String s2=ip.nextLine();
            // Tách s1 và s2 thành các từ riêng biệt
            String[] w1= s1.split("\\s+");
            String[] w2= s2.split("\\s+");
            // Tạo tập hợp lưu trữ các từ s2
            Set<String> setS2 =new HashSet<>(Arrays.asList(w2));
            // Tạo tập hợp kết quả
            Set<String> result =new TreeSet<>();
            //Duyệt qua các phần tử trong s1 và kiểm tra
            for(String tmp : w1){
                if(!setS2.contains(tmp)) result.add(tmp);
            }
            System.out.println(String.join(" ",result));
        }
    }
}
