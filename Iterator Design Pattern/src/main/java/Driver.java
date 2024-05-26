package main.java;
import java.util.Arrays;

public class Driver {
    public static void main(String[] args) {
        // Using the actual classes
        System.out.println("Testing with actual classes:");
        Volunteer vol1 = new Volunteer("Alice", "Teaching");
        Volunteer vol2 = new Volunteer("Bob", "Cooking");

        VolunteerOpportunities opportunities = new VolunteerOpportunities(Arrays.asList(vol1, vol2));
        VolunteerIterator iterator = opportunities.createIterator();

        while (iterator.hasNext()) {
            Volunteer volunteer = iterator.next();
            System.out.println("Volunteer Name: " + volunteer.getName() + ", Skills: " + volunteer.getSkills());
        }

        // Using the stub
        System.out.println("\nTesting with stub:");
        VolunteerIteratorStub stubIterator = new VolunteerIteratorStub();

        if (stubIterator.hasNext()) {
            Volunteer stubVolunteer = stubIterator.next();
            System.out.println("Volunteer Name: " + stubVolunteer.getName() + ", Skills: " + stubVolunteer.getSkills());
        }
    }
}


