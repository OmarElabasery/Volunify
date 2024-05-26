package main.java;

import java.util.Arrays;
import java.util.List;

public class VolunteerIteratorStub implements Iterator<Volunteer> {
    private boolean hasNextCalled = false;

    @Override
    public boolean hasNext() {
        // Stubbed behavior for hasNext method
        if (!hasNextCalled) {
            hasNextCalled = true;
            return true;
        }
        return false;
    }

    @Override
    public Volunteer next() {
        // Stubbed behavior for next method
    	System.out.println("Stub Used!!!");
        return new Volunteer("Stub Volunteer", "Stub Skills");
    }

    // Creating a stubbed VolunteerOpportunities for testing purposes
    public static VolunteerOpportunities createStubbedOpportunities() {
        List<Volunteer> volunteers = Arrays.asList(new Volunteer("Stub Volunteer", "Stub Skills"));
        return new VolunteerOpportunities(volunteers);
    }
}



