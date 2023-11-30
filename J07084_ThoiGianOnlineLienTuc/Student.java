/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J07084_ThoiGianOnlineLienTuc;

/**
 *
 * @author Admin
 */
public class Student implements Comparable<Student>{
    private String name;
    private Long time;

    public Student(String name, long time) {
        this.name = name;
        this.time = time;
    }
    public String toString(){
        return name+" "+time;
    }

    @Override
    public int compareTo(Student o) {
        return o.time.compareTo(time);
    }
}
