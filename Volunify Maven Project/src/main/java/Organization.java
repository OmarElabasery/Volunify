
public class Organization extends User {

    /**
     * Default constructor
     */
    public Organization() {
    }

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
    private String phone_number;

    /**
     * 
     */
    private String email;

    /**
     * 
     */
    private int events_organized;

    /**
     * 
     */
    private int rating;

    /**
     * 
     */
    public void applyForEvent() {
        // TODO implement here
    }

    /**
     * 
     */
 // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for domain
    public void setDomain(String domain) {
        this.domain = domain;
    }

    // Getter for domain
    public String getDomain() {
        return domain;
    }

    // Setter for phone_number
    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    // Getter for phone_number
    public String getPhone_number() {
        return phone_number;
    }

    // Setter for email
    public void setEmail(String email) {
        this.email = email;
    }

    // Getter for email
    public String getEmail() {
        return email;
    }

    // Setter for events_organized
    public void setEvents_organized(int events_organized) {
        this.events_organized = events_organized;
    }

    // Getter for events_organized
    public int getEvents_organized() {
        return events_organized;
    }

    // Setter for rating
    public void setRating(int rating) {
        this.rating = rating;
    }

    // Getter for rating
    public int getRating() {
        return rating;
    }

}