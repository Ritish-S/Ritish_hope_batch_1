public class Organizer extends Person {
    public Organizer(String name, String email) {
        super(name, email);
    }
    @Override
    public String getRole() {
        return "Organizer";
    }
}