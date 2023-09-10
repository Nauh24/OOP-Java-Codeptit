
package J04018_SoPhuc;

public class SoPhuc {
    private int soThuc,soAo;

    public SoPhuc(int soThuc, int soAo) {
        this.soThuc = soThuc;
        this.soAo = soAo;
    }
    public SoPhuc add(SoPhuc a){
        int thuc=this.soThuc+a.soThuc;
        int ao=this.soAo+a.soAo;
        SoPhuc kq =new SoPhuc(thuc, ao);
        return kq;
    }
    public SoPhuc mul(SoPhuc a){
        int thuc =this.soThuc*a.soThuc-this.soAo*a.soAo;
        int ao =this.soThuc*a.soAo+this.soAo*a.soThuc;
        SoPhuc kq =new SoPhuc(thuc, ao);
        return kq;
    }
    public String toString(){
        String s=soThuc+" ";
        if(soAo<0){
            s+="- ";
            soAo*=-1;
        }
        else s+="+ ";
        s+=soAo+"i";
        return s;
    }
}
