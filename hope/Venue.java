public class Venue {
    private String name;
    private int capacity;
    public Venue(String name, int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("Capacity must be positive");
        }
        this.name = name;
        this.capacity = capacity;
    }
    public String getName() { 
        return name; 
    }
    public int getCapacity() {
         return capacity;
    }
}