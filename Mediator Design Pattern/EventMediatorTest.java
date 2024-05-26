package main.java;

public class EventMediatorTest {

	public static void main(String[] args) {
        // Create objects
        EventManager eventManager = new EventManager();
        Notification notification = new Notification();
        EventMediator mediator = new EventMediator(eventManager, notification);

        // Trigger the interaction
        eventManager.createEvent();

        // Since Notification.send() is called within the mediator, you should observe its behavior here.
        // For example, if Notification.send() prints something, you should see that output in the console.
    }
}