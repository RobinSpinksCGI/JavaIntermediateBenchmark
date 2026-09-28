/*
This question is assessing your ability to implement threading to execute multiple tasks at the same time in Java.

The provided MessageSender class has a constructor to initialize the recipient and message fields.

The MessageSender class should override its run() method to simulate the execution of sending the message such that:

It prints a message indicating that the message is being sent.
It simulates the task’s execution time by having the thread sleep for 1 second.
It prints a message indicating the message was sent to the recipient.
The initial MessagingSystem class main() method has been provided. Within the main() method:

Create three MessageSender instances with any recipient and message.
Create Threads instances for each MessageSender instance.
Execute each thread concurrently.
Requirements and Assumptions:

The code must handle potential interruptions that may occur during the pause or delay in executing the current thread.
*/

class MessageSender implements Runnable {
    private String recipient;
    private String message;

    public MessageSender(String recipient, String message) {
        this.recipient = recipient;
        this.message = message;
    }

    public void run() {
        // Your code below:
    }
}

public class MessagingSystem {
    public static void main(String[] args) {
        // Your code below:
    }
}

