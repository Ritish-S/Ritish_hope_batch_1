public class Attendee extends Person {
    private String ticketId;
    public Attendee(String name, String email, String ticketId) {
        super(name, email);
        this.ticketId = ticketId;
    }
    public String getTicketId() {
        return ticketId;
    }
    @Override
    public String getRole() {
        return "Attendee";
    }
}