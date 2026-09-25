// Your imports below:
import java.io.Serializable;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;

// Your code below:
public class Book implements Serializable {
    private String title;
    private String author;
    private static final long serialVersionUID = 1L;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    private void readObject(ObjectInputStream in) throws ClassNotFoundException, IOException {
        in.defaultReadObject();
        this.title = (String) in.readObject();
        this.author = (String) in.readObject();
    }

    private void writeObject(ObjectOutputStream out) throws IOException {
        out.defaultWriteObject();
        out.writeObject(this.title);
        out.writeObject(this.author);
    }
}