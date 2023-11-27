package Tutorial13;

public class Vacation extends Product {
    private String location;
    private boolean allInclusive;

    // Constructor that includes the price, location, and whether it is all-inclusive
    public Vacation(int price, String location, boolean allInclusive) {
        super(price); // Set the price in the superclass Product
        this.location = location;
        this.allInclusive = allInclusive;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public boolean isAllInclusive() {
        return allInclusive;
    }

    public void setAllInclusive(boolean allInclusive) {
        this.allInclusive = allInclusive;
    }

    public String toString() {
        return "Id: " + getId() + ", Location: " + location + ", All Inclusive: " + (allInclusive ? "Yes" : "No") + ", Price: " + price;
    }
}
