import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
public class J03020_TimTuThuanNghichDaiNhat {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        LinkedHashMap<String,Integer> map=new LinkedHashMap<>();
        int maxLen=0;
        while(sc.hasNext()){
            String s=sc.next();
            if(s.equals("0")) break;
            StringBuilder sb=new StringBuilder(s);
            if(s.equals(sb.reverse().toString())&&s.length()>=maxLen){
                if(map.containsKey(s)){
                    map.put(s, map.get(s)+1);
                }
                else map.put(s, 1);
                maxLen=Math.max(maxLen,s.length());
            }
        }
        //System.out.println(maxLen);
        for(Map.Entry<String,Integer> entry: map.entrySet()){
            if(entry.getKey().length()==maxLen){
                System.out.println(entry.getKey()+" "+entry.getValue());
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