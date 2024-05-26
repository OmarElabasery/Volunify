package main.java;

public class EventMediator implements Mediator {
    private EventManager eventManager;
    private Notification notification;

    public EventMediator(EventManager eventManager, Notification notification) {
        this.eventManager = eventManager;
        this.notification = notification;
        this.eventManager.setMediator(this);
        this.notification.setMediator(this);
    }

    @Override
    public void notify(Component sender, String event) {
        if (event.equals("EventCreated")) {
            notification.send();
        }
    }
}
