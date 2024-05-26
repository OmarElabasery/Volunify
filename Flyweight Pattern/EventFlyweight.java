package FlyweightClasses;
public class EventFlyweight {
	private final String domain;
    private final String name;
    private final String description;
    
    public EventFlyweight(String domain, String name, String description) {
        this.domain = domain;
        this.name = name;
        this.description = description;
    }

    public String getDomain() {
        return domain;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

}
