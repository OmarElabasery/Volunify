/**
 * 
 */
public class Event {

    /**
     * Default constructor
     */
    public Event() {
    }

    /**
     * 
     */
    private int id;

    /**
     * 
     */
    private String name;

    /**
     * 
     */
    private String domain;

    /**
     * 
     */
    private String description;

    /**
     * 
     */
    private String time;

    /**
     * 
     */
    private String location;

    /**
     * 
     */
    private int numberOfRequiredVolunteers;

    /**
     * 
     */
    private int numberOfVolunteersApplied;

    /**
     * @param name 
     * @param domain 
     * @param description 
     * @param time 
     * @param location 
     * @param numberOfRequiredVolunteers
     */
    public void createEvent(String name, String domain, String description, String time, String location, int numberOfRequiredVolunteers) {
        // TODO implement here
    }

    /**
     * 
     */
    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setNumberOfRequiredVolunteers(int numberOfRequiredVolunteers) {
        this.numberOfRequiredVolunteers = numberOfRequiredVolunteers;
    }

    public void setNumberOfVolunteersApplied(int numberOfVolunteersApplied) {
        this.numberOfVolunteersApplied = numberOfVolunteersApplied;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDomain() {
        return domain;
    }

    public String getDescription() {
        return description;
    }

    public String getTime() {
        return time;
    }

    public String getLocation() {
        return location;
    }

    public int getNumberOfRequiredVolunteers() {
        return numberOfRequiredVolunteers;
    }

    public int getNumberOfVolunteersApplied() {
        return numberOfVolunteersApplied;
    }
}

