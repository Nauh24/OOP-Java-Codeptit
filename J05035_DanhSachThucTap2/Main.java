
package J05035_DanhSachThucTap2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        ArrayList<Student> list =new ArrayList<>(n);
        while(n-- >0){
            String id =sc.nextLine();
            String name =sc.nextLine();
            String className =sc.nextLine();
            String email =sc.nextLine();
            String doanhNghiep =sc.nextLine();
            Student st =new Student(id, name, className, email, doanhNghiep);
            list.add(st);
        }
        Collections.sort(list);
        int q=Integer.parseInt(sc.nextLine());
        while(q-- >0){
            String s =sc.nextLine();
            for(Student i : list){
                if(i.getDoanhNghiep().equals(s)){
                    System.out.println(i);
                }
            }
        }
    }
}
/*
6
B17DCCN016 
Le Khac Tuan Anh 
D17HTTT2   
test1@stu.ptit.edu.vn
VIETTEL
B17DCCN107 
Dao Thanh Dat    
D17CNPM5   
test2@stu.ptit.edu.vn
FPT
B17DCAT092 
Cao Danh Huy     
D17CQAT04-B
test3@stu.ptit.edu.vn
FPT
B17DCCN388 
Cao Sy Hai Long  
D17CNPM2   
test4@stu.ptit.edu.vn
VNPT
B17DCCN461 
Dinh Quang Nghia 
D17CNPM2   
test5@stu.ptit.edu.vn
FPT
B17DCCN554 
Bui Xuan Thai    
D17CNPM1   
test6@stu.ptit.edu.vn
GAMELOFT
1
FPT
*/
