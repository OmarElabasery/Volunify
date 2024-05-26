package FlyweightClasses;
import java.time.LocalDateTime;
public class Event {
	private final int id;
    private final LocalDateTime time;
    private final String location;
    private final int numRequired;
    private final int numApplied;
    private final EventFlyweight eventFlyweight;
    
    public Event(int id, LocalDateTime time, String location, int numRequired, int numApplied, EventFlyweight eventFlyweight) {
        this.id = id;
        this.time = time;
        this.location = location;
        this.numRequired = numRequired;
        this.numApplied = numApplied;
        this.eventFlyweight = eventFlyweight;
    }

    public int getId() {
        return id;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public String getLocation() {
        return location;
    }

    public int getNumRequired() {
        return numRequired;
    }

    public int getNumApplied() {
        return numApplied;
    }

    public EventFlyweight getEventFlyweight() {
        return eventFlyweight;
    }
    
    public String getDetails() {
        return "Event[ID=" + id + ", Time=" + time + ", Location=" + location +
               ", RequiredVolunteers=" + numRequired + ", VolunteersApplied=" + numApplied + 
               ", Domain=" + eventFlyweight.getDomain() + 
               ", Name=" + eventFlyweight.getName() + 
               ", Description=" + eventFlyweight.getDescription() + "]";
    }
}
