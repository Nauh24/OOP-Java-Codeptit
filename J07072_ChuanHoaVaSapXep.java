
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
class Person implements Comparable<Person>{
    private String name;

    public Person(String name) {
        this.name = name;
    }
    public void chuanHoa(){
        String [] s=name.trim().split("\\s+");
        String ans="";
        for(String i:s){
            ans+=i.substring(0,1).toUpperCase()+i.substring(1).toLowerCase()+" ";
        }
        name=ans;
    }
    public String tenLien(){
        chuanHoa();
        String s[] =name.split("\\s+");
        String ans=s[s.length-1]+s[0];
        String res="";
        for(int i=1;i<s.length-1;i++){
            res+=s[i];
        }
        ans+=res;
        return ans;
    }
    public String toString(){
        return name;
    }

    @Override
    public int compareTo(Person o) {
        return tenLien().compareTo(o.tenLien());
    }
    
}
public class J07072_ChuanHoaVaSapXep {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc=new Scanner (new File("DANHSACH.in"));
        ArrayList<Person> list=new ArrayList<>();
        while(sc.hasNext()){
            list.add(new Person(sc.nextLine().trim()));
        }
        Collections.sort(list);
        for(Person i: list){
            System.out.println(i);
        }
            
    }
}
