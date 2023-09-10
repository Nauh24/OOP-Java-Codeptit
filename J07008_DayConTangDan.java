import java.io.File;
import java.io.IOException;
import java.util.*;


public class J07008_DayConTangDan {
    static int n;
    static int [] a;
    static ArrayList<String> ans =new ArrayList<>();
    static ArrayList<Integer> arr =new ArrayList<>();
   static void Try(int i){
        if(arr.size()>1){
            String s="";
            for(int j:arr) s+=j +" ";
           ans.add(s);
        }
        for(int j=i;j<n;j++){
            if(arr.isEmpty()||a[j]>arr.get(arr.size()-1)){
                arr.add(a[j]);
                Try(j+1);
                arr.remove(arr.size()-1);
            }
        }
    }
    public static void main(String[] args) throws IOException{
        Scanner sc =new Scanner(new File("DATA.txt"));
        n=sc.nextInt();
         a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        Try(0);
        Collections.sort(ans);
        for(String i: ans){
            System.out.println(i);
        }
    }
}
