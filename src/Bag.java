import java.util.ArrayList;
import java.util.List;

// Your code below:
public class Bag<T> {
    public List<T> items;

    public Bag () {
        items = new ArrayList<T>();
    }

    public void addItem(T item) {
        items.add(item);
    }

    public static void main(String[] args) {
        Bag<String> wordBag = new Bag<>();
        wordBag.addItem("choice");

        Bag<Integer> intBag = new Bag<>();
        intBag.addItem(7);
    }
}
