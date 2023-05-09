package ua.ithillel.iodemo.decorator;

public class SMSNotifier extends NotifierDecarator {
    public SMSNotifier(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void sendMessage(String message) {
        System.out.printf("sending SMS %s%n", message);

        notifier.sendMessage(message);
    }
}
