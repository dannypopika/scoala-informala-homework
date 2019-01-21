package Components;

public abstract class Product implements CustomerOptions {

    private int id;
    private int stockNumber;
    private double price;
    private double validity;
    private double weight;


    public Product(int id, int stockNumber, double price, double validity, double weight) {
        this.id = id;
        this.stockNumber = stockNumber;
        this.price = price;
        this.validity = validity;
        this.weight = weight;
    }

    public int getStockNumber() {
        return stockNumber;
    }

    public void setStockNumber(int stockNumber){
        this.stockNumber = stockNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void getValidity() {
        return validity;
    }

    public void setValidity(double validity) {
        this.validity = validity;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
