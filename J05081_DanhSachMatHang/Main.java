
package J05081_DanhSachMatHang;


import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int m =sc.nextInt();
        sc.nextLine();
        ArrayList<MatHang> list=new ArrayList<>();
        while(m -- >0){
            list.add(new MatHang(sc.nextLine(),sc.nextLine(),Integer.parseInt(sc.nextLine()),Integer.parseInt(sc.nextLine())));
            
        }
        Collections.sort(list,new Comparator<MatHang>(){
            @Override
            public int compare(MatHang o1, MatHang o2) {
                return o2.getProfit()-o1.getProfit();
            }
            
        });
        for(MatHang i:list){
            System.out.println(i);
        }
    }
}
