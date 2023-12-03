/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05075_DiemDanh2;


/**
 *
 * @author Admin
 */
public class SinhVien {

    private String id, name, grade;
    private int dcc;

    public SinhVien(String id, String name, String grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
        this.dcc=dcc;
    }

    public String getGrade() {
        return grade;
    }

    public String getId() {
        return id;
    }

   
    
    public void setDcc(String s) {
        int cnt = 10;
        for (int j = 0; j < 10; j++) {
            if (s.charAt(j) == 'm') {
                cnt -= 1;
            } else if (s .charAt(j) == 'v') {
                cnt -= 2;
            }
        }
        if(cnt<0) cnt=0;
        this.dcc=cnt;
    }


    public String toString() {
        if (dcc == 0) {
            return id + " " + name + " " + grade + " " + this.dcc + " " + "KDDK";
        } else {
            return id + " " + name + " " + grade + " " + this.dcc;
        }

    }
}
