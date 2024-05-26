

/**
 * 
 */
public class Admin extends User {

    /**
     * Default constructor
     */
    public Admin() {
    }

    /**
     * 
     */
    private String first_name;

    /**
     * 
     */
    private String last_name;

    /**
     * @param id 
     * @param name 
     * @param domain 
     * @param description 
     * @param time 
     * @param location 
     * @param numberOfRequiredVolunteers
     */
    public void createEvent(int id, String name, String domain, String description, String time, String location, int numberOfRequiredVolunteers) {
        // TODO implement here
    }

    /**
     * 
     */
    public void sendNotificationToVolunteers() {
        // TODO implement here
    }

    /**
     * @param name 
     * @param domain 
     * @param description 
     * @param time 
     * @param location 
     * @param numberOfRequiredVolunteers
     */
    public void approveEventCreation(int name, String domain, String description, String time, String location, int numberOfRequiredVolunteers) {
        // TODO implement here
    }

    /**
     * 
     */
    public void notifyDeniedEventCreation() {
        // TODO implement here
    }

    /**
     * 
     */
    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    // Getter for first_name
    public String getFirst_name() {
        return first_name;
    }

    // Setter for last_name
    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    // Getter for last_name
    public String getLast_name() {
        return last_name;
    }

}