package iterator;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Vector;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>();
        
        for (int i = 0; i < 10; i++) {
            list.add("a" + i);
        }

        Vector<String> vector = new Vector<String>();

        for (int i = 0; i < 15; i++) {
            vector.add("b" + i);
        }

        HashSet<String> hashset = new HashSet<>();

        for (int i = 0; i < 20; i++) {
            hashset.add("c" + i);
        }

        afficheElements(list.iterator());
        afficheElements(vector.iterator());
        afficheElements(hashset.iterator());

    }

    public static void afficheElements(Iterator<String> it) {
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

}
