
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class J07021_ChuanHoaXauHoTenTrongFile {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc =new Scanner(new File("DATA.in"));
        while(sc.hasNextLine()){
            String s=sc.nextLine();
            if(s.equals("END")) break;
            String [] res=s.trim().split("\\s+");
            String ans="";
            for(String i: res){
                ans+=i.substring(0,1).toUpperCase()+i.substring(1).toLowerCase()+" ";
            }
            System.out.println(ans);
        }
    }
}
