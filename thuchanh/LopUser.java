package thuchanh;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

class User{
    private String username,password;
    private int login;
    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setLogin(int login) {
        this.login = login;
    }

    public int getLogin() {
        return login;
    }
    
}
public class LopUser {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        ArrayList<User> list=new ArrayList<>(n);
        while (n-- >0){
            String s[]=sc.nextLine().split("\\s+");
            String user=s[0];
            String pass=s[1];
            User u=new User(user, pass);
            list.add(u);
        }
        int m=Integer.parseInt(sc.nextLine());
        HashMap<String,Integer> map=new HashMap<>();
        while(m-- >0){
            String s[]=sc.nextLine().split("\\s+");
            String x=s[0];
            String y=s[1];
            map.putIfAbsent(x, 0);
            for(User i : list){
                if(x.equals(i.getUsername())&&y.equals(i.getPassword())){
                    //if(map.get(x)>0){
                        map.put(x, map.get(x)+1);
                    //}
                    //else map.put(x, 1);
                    i.setLogin(map.get(x));
                    break;
                }
            }
            for(User i : list){
                //System.out.print(i.getLogin()+" ");
                System.out.println(i.getUsername());
            }
        }
    }
}
/*
4 
tendangnhap matkhau
username password
nguoidung m4tkh4un4yr4tb40m4t
user2 password
6 
tendangnhap matkhau
username matkhau
bfc34 contest
username password
tendangnhap matkhau
user2 password
*/