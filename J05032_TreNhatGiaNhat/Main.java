
package J05032_TreNhatGiaNhat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner sc =new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        ArrayList<Person> list =new ArrayList<>();
        while(n-- >0){
            String name =sc.next();
            String date =sc.nextLine();
            Date bd =new SimpleDateFormat("dd/MM/yyyy").parse(date);
            Person ps =new Person(name, bd);
            list.add(ps);
        }
        Collections.sort(list);
        System.out.println(list.get(0).getName());
        System.out.println(list.get(list.size()-1).getName());
    }
}
/*
5
Nam 01/10/1991
An 30/12/1990
Binh 15/08/1993
Tam 18/09/1990
Truong 20/09/1990
*/
