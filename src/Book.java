/*
This question is assessing your ability to persist objects using the Serializable interface in Java.

Define a Book class that is serializable:

Declare class attributes for the book title and author.
Declare a serialVersionUID in your class to control serialization versions, and set its value to 1L.
Create a constructor that takes in the title and author as parameters and initializes the corresponding attributes.
Create a custom serialization method named readObject() to read the author and title information into a Book object.
*/

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