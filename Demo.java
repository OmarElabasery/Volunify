package FlyweightClasses;
import java.time.LocalDateTime;

public class Demo {
	public static void main(String[] args) {
		EventFactory factory = new EventFactory();
        EventFlyweight flyweight1 = EventFactory.getEventFlyweight("Education", "Math Workshop", "A workshop on advanced math concepts");
        EventFlyweight flyweight2 = EventFactory.getEventFlyweight("Education", "Math Workshop", "A workshop on advanced math concepts");
        EventFlyweight flyweight3 = EventFactory.getEventFlyweight("Health", "Health Camp", "A health check-up camp for the community");

        Event event1 = new Event(001, LocalDateTime.now(), "Community Center", 10, 5, flyweight1);
        Event event2 = new Event(002, LocalDateTime.now().plusDays(1), "School", 15, 10, flyweight2);
        Event event3 = new Event(003, LocalDateTime.now().plusWeeks(1), "Clinic", 20, 15, flyweight3);

        System.out.println(event1.getDetails());
        System.out.println(event2.getDetails());
        System.out.println(event3.getDetails());
        
        EventFlyweight flyweight4 = factory.getEventFlyweight("Education", "Math Workshop", "A workshop on advanced math concepts");
        Event event4 = new Event(004, LocalDateTime.now().plusMonths(1), "Library", 30, 25, flyweight4);

        System.out.println(event4.getDetails());

        //Display flyweight count to confirm reuse
        System.out.println("Flyweight count: " + factory.getFlyweightCount());
    }
}
