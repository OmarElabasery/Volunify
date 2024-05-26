package main.java;

import java.util.List;

public class VolunteerOpportunities {
    private List<Volunteer> volunteers;

    public VolunteerOpportunities(List<Volunteer> volunteers) {
        this.volunteers = volunteers;
    }

    public VolunteerIterator createIterator() {
        return new VolunteerIterator(volunteers);
    }
}
