package main.java;

import java.util.List;

public class VolunteerIterator implements Iterator<Volunteer> {
    private List<Volunteer> volunteers;
    private int index;

    public VolunteerIterator(List<Volunteer> volunteers) {
        this.volunteers = volunteers;
        this.index = 0;
    }

    public boolean hasNext() {
        return index < volunteers.size();
    }

    public Volunteer next() {
        if (this.hasNext()) {
            return volunteers.get(index++);
        }
        return null;
    }
}
