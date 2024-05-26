package FlyweightClasses;
import java.util.HashMap;
import java.util.Map;

public class EventFactory {
	private static final Map<String, EventFlyweight> eventMap = new HashMap<>();

    public static EventFlyweight getEventFlyweight(String domain, String name, String description) {
        String key = domain + "-" + name + "-" + description;
        if (!eventMap.containsKey(key)) {
            eventMap.put(key, new EventFlyweight(domain, name, description));
        }
        return eventMap.get(key);
    }
    public int getFlyweightCount() {
        return eventMap.size();
    }

}
