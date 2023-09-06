
package J04005_KhaiBaoLopThiSinh;

public class ThiSinh {
    private String name , bird;
    private float d1,d2,d3;

    public ThiSinh() {
        name ="";
        bird ="";
        d1=d2=d3=0;
    }

    public ThiSinh(String name, String bird, float d1, float d2, float d3) {
        this.name = name;
        this.bird = bird;
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
    }

    public String getName() {
        return name;
    }

    public String getBird() {
        return bird;
    }
    public String toString(){
        return name+" "+bird+" "+String.format("%.1f",d1+d2+d3);
    }
}
