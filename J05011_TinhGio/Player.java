package J05011_TinhGio;

public class Player implements Comparable<Player> {

    private String id, name, in, out;

    public Player(String id, String name, String in, String out) {
        this.id = id;
        this.name = name;
        this.in = in;
        this.out = out;
    }

    public Integer time() {
        int t1 = (in.charAt(0) - '0') * 10 + (in.charAt(1) - '0');
        t1 = t1 * 60 + ((in.charAt(3) - '0') * 10 + (in.charAt(4) - '0'));
        int t2 = (out.charAt(0) - '0') * 10 + (out.charAt(1) - '0');
        t2 = t2 * 60 + ((out.charAt(3) - '0') * 10 + (out.charAt(4) - '0'));
        return t2 - t1;
    }

    public String formatTime() {
        int h = time() / 60;
        int m = time() % 60;
        String res = "";
        res += String.valueOf(h) + " gio " + String.valueOf(m) + " phut";
        return res;
    }

    @Override
    public int compareTo(Player o) {
        return o.time().compareTo(this.time());
    }
    public String toString(){
        return id +" "+name+" "+formatTime();
    }
            
}
