package main.java;

public class Volunteer {
    private String name;
    private String skills;
    
    public Volunteer(String name, String skills) {
        this.name = name;
        this.skills = skills;
    }
    
    // getters and setters
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getSkills() {
        return skills;
    }
    
    public void setSkills(String skills) {
        this.skills = skills;
    }
}
