/*
This question is assessing your ability to apply the principles of generics to effectively utilize the collections framework in Java.

First, define a class named MessageHandler such that it:

has two generic type parameters
contains a class variable called messageMap that maps a generic key to a generic value
has a constructor method that initializes the messageMap as a HashMap with generic types
Then, within the MessageHandler class, define an addMessage() method such that it:

takes in two parameters of each generic type
adds them as a key/value pair to the messageMap map
Last, create a main() method within the MessageHandler class such that it:

instantiates a MessageHandler object called messageHandler1
adds an Integer key and String value for the message to it
instantiates a second MessageHandler object called messageHandler2
adds a String key and String value pair for the message to it
Requirements and Assumptions:

The generic types used for each instantiated message handler will be different.
The addMessage() method does NOT have to handle null inputs.
*/

import java.util.HashMap;
import java.util.Map;

public class MessageHandler<T, P> {
    Map<T, P> messageMap;

    public MessageHandler() {
        messageMap = new HashMap<T, P>();
    }

    public void addMessage(T t, P p) {
        messageMap.put(t, p);
    }

    public static void main(String[] args) {
        MessageHandler<Integer, String> messageHandler1 = new MessageHandler<>();
        messageHandler1.addMessage(1, "one");
        MessageHandler<String, String> messageHandler2 = new MessageHandler<>();
        messageHandler2.addMessage("two", "three");
    }
}
