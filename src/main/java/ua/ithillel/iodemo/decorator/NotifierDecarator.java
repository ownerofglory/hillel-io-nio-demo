package ua.ithillel.iodemo.decorator;

public abstract class NotifierDecarator extends Notifier {
    protected Notifier notifier;

    public NotifierDecarator(Notifier notifier) {
        this.notifier = notifier;
    }
}
