package Components;

public class AnimalProduct extends Product {

    private int storageTemp;

    public AnimalProduct(int id, int stockNumber, double price, double validity, double weight, int storageTemp) {
        super(id, stockNumber, price, validity, weight);
        this.storageTemp = storageTemp;
    }

    @Override
    public void createProd() {

    }

    @Override
    public void sellProd() {

    }

    @Override
    public void displayDailyReport() {

    }

    @Override
    public void exitOptions() {

    }
}
