public class MessagingSystem {
    public static void main(String[] args) {
        // Your code below:
        MessageSender messageSender1 = new MessageSender("recipient 1", "message 1");
        MessageSender messageSender2 = new MessageSender("recipient 2", "message 2");
        MessageSender messageSender3 = new MessageSender("recipient 3", "message 3");

        Thread thread1 = new Thread(messageSender1);
        Thread thread2 = new Thread(messageSender2);
        Thread thread3 = new Thread(messageSender3);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
