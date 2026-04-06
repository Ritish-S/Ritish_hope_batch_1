public class Main {
    public static void main(String[] args) {
        Organizer org = new Organizer("Ritish", "ritish@mail.com");
        Venue venue = new Venue("City Hall", 2);
        EventManager manager = new EventManager();
        Event meetup = manager.createEvent("Tech Meetup", org, venue);
        Attendee a1 = new Attendee("John", "john@mail.com", "T001");
        Attendee a2 = new Attendee("Meera", "meera@mail.com", "T002");
        Attendee a3 = new Attendee("Sam", "sam@mail.com", "T003");

        meetup.addAttendee(a1);
        meetup.addAttendee(a2);
        meetup.addAttendee(a3);  
        meetup.showDetails();
    }
}