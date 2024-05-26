

/**
 * 
 */
public class User {

    /**
     * Default constructor
     */
    public User() {
    }

    /**
     * 
     */
    private int id;

    /**
     * 
     */
    private String password;

    /**
     * 
     */
    private String username;

    /**
     * 
     */
    private String email;

    /**
     * @param first_name 
     * @param last_name 
     * @param gender 
     * @param phone_number
     */
    public void createVolunteer(String first_name, String last_name, char gender, String phone_number) {
        // TODO implement here
    }

    /**
     * @param name 
     * @param domain 
     * @param phone_number
     */
    public void createOrganization(String name, String domain, String phone_number) {
        // TODO implement here
    }

    /**
     * @param rating
     */
    public void enterFeedback(int rating) {
        // TODO implement here
    }

    /**
     * 
     */
    public void editProfile() {
        // TODO implement here
    }

    /**
     * 
     */
 // Setter for id
    public void setId(int id) {
        this.id = id;
    }

    // Getter for id
    public int getId() {
        return id;
    }

    // Setter for password
    public void setPassword(String password) {
        this.password = password;
    }

    // Getter for password
    public String getPassword() {
        return password;
    }

    // Setter for username
    public void setUsername(String username) {
        this.username = username;
    }

    // Getter for username
    public String getUsername() {
        return username;
    }

    // Setter for email
    public void setEmail(String email) {
        this.email = email;
    }

    // Getter for email
    public String getEmail() {
        return email;
    }

}