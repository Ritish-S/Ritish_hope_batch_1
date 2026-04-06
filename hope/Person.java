public abstract class Person {
    private String name;
    private String email;
    public Person(String name, String email) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty");
        }
        this.name = name;
        this.email = email;
    }
    public String getName() { 
        return name;
 }
    public String getEmail() {
         return email; 
    }
    public abstract String getRole(); 
}