package Tutorial13;

public abstract class Product {
    private final int id;
    protected int price;

    private static int lastId = 1;

    // Protected constructor so that only subclasses can set the price
    protected Product(int price) {
        this.price = price;
        this.id = lastId;
        lastId++;
    }

    public int getPrice() {
        return price;
    }

    public int getId() {
        return id;
    }

    protected void setPrice(int price) {
        this.price = price;
    }
}
