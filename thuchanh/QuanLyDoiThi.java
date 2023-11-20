package thuchanh;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Truong {
    private String id, name;
    public Truong(String id, String name) {
        this.id = id;
        this.name = name;
    }
    public Truong(String name) {
        this.name = name;
    }
    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String toString() {
        return id + " " + name;
    }
}

class Team implements Comparable<Team> {
    private String tenTeam;
    private String maTeam;
    private String tenTruong;
    private static int cnt = 1;
    public Team(String tenTeam, String tenTruong) {
        this.tenTeam = tenTeam;
        this.tenTruong = tenTruong;
         this.maTeam=maTeam;
    }
    public String getTenTeam() {
        return tenTeam;
    }

    public String getMaTeam() {
        return maTeam;
    }

    public void setMaTeam() {
        this.maTeam = "team" + String.format("%02d", cnt++);
    }
    @Override
    public int compareTo(Team o) {
        if (getTenTruong().equals(o.getTenTruong())) {
            return getTenTeam().compareTo(o.getTenTeam());
        } else {
            return getTenTruong().compareTo(o.getTenTruong());
        }
    }
public String toString() {
        return maTeam + " " + tenTeam + " " + tenTruong;
    }
    public String getTenTruong() {
        return tenTruong;
    }
}

public class QuanLyDoiThi {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc1 = new Scanner(new File("src/thuchanh/INSTITUTION.in"));
        Scanner sc2 = new Scanner(new File("src/thuchanh/REGISTER.in"));
        ArrayList<Truong> list1 = new ArrayList<>();
        ArrayList<Team> list2 = new ArrayList<>();
        int n = Integer.parseInt(sc1.nextLine());
        while (n-- > 0) {
            String s = sc1.nextLine();
            String res[] = s.split("\\s+");
            String ans = "";
            String id = res[0];
            for (int i = 1; i < res.length; i++) {
                ans += res[i] + " ";
            }
            Truong t = new Truong(id, ans);
            list1.add(t);
        }
        int m = Integer.parseInt(sc2.nextLine());
        while (m-- > 0) {
            String s[] = sc2.nextLine().split("\\s+");
            int k = Integer.parseInt(s[1]);
            while (k-- > 0) {
                String x = null;
                for (Truong i : list1) {
                    if (i.getId().equals(s[0])) {
                        x = i.getName();
                        break;
                    }
                }
                Team tm = new Team(sc2.nextLine(), x);
                list2.add(tm);
            }
        }
        Collections.sort(list2);
        for (Team i : list2) {
            i.setMaTeam();
            System.out.println(i);
        }
    }
}
