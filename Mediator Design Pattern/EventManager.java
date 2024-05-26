package main.java;

public class EventManager extends Component {
    public void createEvent() {
        // Event creation logic
        System.out.println("Event Created");
        mediator.notify(this, "EventCreated");
    }
}
