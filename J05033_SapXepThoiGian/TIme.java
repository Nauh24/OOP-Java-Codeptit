
package J05033_SapXepThoiGian;

public class Time {
    private int h,m,s;

    public Time(int h, int m, int s) {
        this.h = h;
        this.m = m;
        this.s = s;
    }

    public int getH() {
        return h;
    }

    public int getM() {
        return m;
    }

    public int getS() {
        return s;
    }

    @Override
    public String toString() {
        return h +" " + m + " " + s;
    }
    
}
