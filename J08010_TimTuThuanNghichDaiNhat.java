import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class J08010_TimTuThuanNghichDaiNhat {
    public static boolean check(String s){
        StringBuilder sb=new StringBuilder(s);
        return s.equals(sb.reverse().toString());
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int Max=0;
        ArrayList<String> list=new ArrayList<>();
        HashMap<String,Integer> map=new HashMap<>();
        while(sc.hasNext()){
            String s=sc.next();
           // if(s.equals("0")) break;
            if(check(s)){
                list.add(s);
                Max=Math.max(Max, s.length());
                if(map.containsKey(s)){
                    map.put(s, map.get(s)+1);
                }
                else map.put(s, 1);
            }
        }
        //System.out.println(Max);
        ArrayList<String> a=new ArrayList<>();
        for(String i: list){
            if(i.length()==Max&&!a.contains(i)){
                System.out.println(i+" "+map.get(i));
                a.add(i);
            }
        }
    }
}
/*
AAA BAABA HDHDH ACBSD SRGTDH DDDDS
DUAHD AAA AD DA HDHDH AAA AAA AAA AAA
DDDAS HDHDH HDH AAA AAA AAA AAA AAA
AAA AAA AAA
DHKFKH DHDHDD HDHDHD DDDHHH HHHDDD
TDTD

*/