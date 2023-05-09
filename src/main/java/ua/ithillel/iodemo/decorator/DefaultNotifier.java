package ua.ithillel.iodemo.decorator;

public class DefaultNotifier extends Notifier {
    @Override
    public void sendMessage(String message) {
        System.out.println("Message: " + message);
    }
}
