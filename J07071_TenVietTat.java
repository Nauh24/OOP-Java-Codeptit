
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Person implements Comparable<Person> {
    private String name;
    public Person(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public String vietTat() {
        String s[] = name.split("\\s+");
        String ans = "";
        for (String i : s) {
            ans += i.substring(0, 1)+".";
        }
        
        return ans.substring(0,ans.length()-1);
    }

    public String toString() {
        return name;
    }

    public String x() {
        String s[] = name.split("\\s+");
        String ans=s[s.length-1];
        for(int i=0;i<s.length-1;i++){
            ans+=s[i];
        }
        return ans;
    }

    public boolean check(String s) {
    if (s.length() != vietTat().length())
            return false;
    for(int i=0;i<s.length();i++){
        if(s.charAt(i)=='*') continue;
        if(s.charAt(i)!=vietTat().charAt(i)) return false;
    }
    return true;
    }

    @Override
    public int compareTo(Person o) {
        return x().compareTo(o.x());
    }
}

public class J07071_TenVietTat {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DANHSACH.in"));
        int n = Integer.parseInt(sc.nextLine());
       ArrayList<Person> list = new ArrayList<>();
        //ArrayList<String> list = new ArrayList<>();
        while (n-- > 0) {
            String x=sc.nextLine();
            Person p = new Person(x);
            list.add(p);
        }
        Collections.sort(list);

        int m = Integer.parseInt(sc.nextLine());
        while (m-- > 0) {
            String s = sc.nextLine();
            for (Person i : list) {
                if(i.check(s)) 
                    System.out.println(i);
            }
        }
    }
}
