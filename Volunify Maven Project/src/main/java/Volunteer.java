
/**
 * 
 */
public class Volunteer extends User {

    /**
     * Default constructor
     */
    public Volunteer() {
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
     * 
     */
    private char gender;

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
    private int events_joined;

    /**
     * 
     */
    private int rating;

    /**
     * 
     */
    public void viewEvents() {
        // TODO implement here
    }

    /**
     * 
     */
    public void applyToVolunteer() {
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

    // Setter for gender
    public void setGender(char gender) {
        this.gender = gender;
    }

    // Getter for gender
    public char getGender() {
        return gender;
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

    // Setter for events_joined
    public void setEvents_joined(int events_joined) {
        this.events_joined = events_joined;
    }

    // Getter for events_joined
    public int getEvents_joined() {
        return events_joined;
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