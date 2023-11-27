package Tutorial13;

public class Car extends Product {
    private int numberOfDoors;
    private String licencePlate;

    // Constructor that includes the price, number of doors, and license plate
    public Car(int price, int numberOfDoors, String licencePlate) {
        super(price);
        this.numberOfDoors = numberOfDoors;
        this.licencePlate = licencePlate;

    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public String getLicencePlate() {
        return licencePlate;
    }

    public void setLicencePlate(String licencePlate) {
        this.licencePlate = licencePlate;
    }

    public String toString() {
        return "Id: " + getId() + ", License Plate: " + this.getLicencePlate() + ", Number of Doors: " + this.getNumberOfDoors() + ", Price: " + this.getPrice();
    }
}
