import java.util.ArrayList;
import java.util.List;
public class EventManager {
    private List<Event> events = new ArrayList<>();
    public Event createEvent(String title, Organizer organizer, Venue venue) {
        Event e = new Event(title, organizer, venue);
        events.add(e);
        return e;
    }
    public Event findEvent(String keyword) {
        for (Event e : events) {
            if (e != null && e.toString().contains(keyword)) {
                return e;
            }
        }
        return null;
    }
}