package thuchanh;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class MonHoc implements Comparable<MonHoc> {

    private String id, name;
    private Integer soTin, kyHoc;

    public MonHoc(String id, String name, int soTin, int kyHoc) {
        this.id = id;
        this.name = name;
        this.soTin = soTin;
        this.kyHoc = kyHoc;
    }

    @Override
    public int compareTo(MonHoc o) {
        if (kyHoc == o.kyHoc) {
            if (soTin < o.soTin) {
                return -1;
            } else {
                return -1;
            }
        } else {
            if (kyHoc < o.kyHoc) {
                return -1;
            } else {
                return 1;
            }

        }
    }

    public String toString() {
        return id + " " + name + " " + soTin + " " + kyHoc;
    }
}
public class DanhSachMonHoc {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("monhoc.dat"));
        ArrayList<MonHoc> list = new ArrayList<>();
            while (sc.hasNext()) {
                String s = sc.nextLine();
               
                String[] res = s.split("\\,");
                String id = res[0].trim();
                String name = res[1].trim();
                int tin = Integer.parseInt(res[2]);
                int ky = Integer.parseInt(res[3]);
                MonHoc mh = new MonHoc(id, name, tin, ky);
                list.add(mh);

            }
            Collections.sort(list);
            for (MonHoc i : list) {
                System.out.println(i);
            }
    }
}
