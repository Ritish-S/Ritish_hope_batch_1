import java.util.ArrayList;
import java.util.List;
public class Event {
    private String title;
    private Organizer organizer;
    private Venue venue;
    private List<Attendee> attendees = new ArrayList<>();
    public Event(String title, Organizer organizer, Venue venue) {
        if (title == null || title.trim().isEmpty()) {
            throw new IllegalArgumentException("Event title cannot be empty");
        }
        this.title = title;
        this.organizer = organizer;
        this.venue = venue;
    }
    public boolean addAttendee(Attendee attendee) {
        if (attendees.size() >= venue.getCapacity()) {
            System.out.println("Cannot add " + attendee.getName() + ": Venue is full");
            return false;
        }
        attendees.add(attendee);
        return true;
    }
    public void showDetails() {
        System.out.println("\n--- Event Details ---");
        System.out.println("Title: " + title);
        System.out.println("Organizer: " + organizer.getName());
        System.out.println("Venue: " + venue.getName());
        System.out.println("Attendees (" + attendees.size() + "):");
        for (Attendee a : attendees) {
            System.out.println("- " + a.getName() + " (Ticket: " + a.getTicketId() + ")");
        }
    }
}