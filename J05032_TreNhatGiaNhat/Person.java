
package J05032_TreNhatGiaNhat;

import java.util.Date;

public class Person implements Comparable<Person>{
    private String name;
    private Date bd;

    public Person(String name, Date bd) {
        this.name = name;
        this.bd = bd;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Person o) {
        return o.bd.compareTo(this.bd);
    }
    
}
