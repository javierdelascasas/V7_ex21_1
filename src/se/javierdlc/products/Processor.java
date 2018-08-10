package se.javierdlc.products;

public class Processor implements Product{
    private int id;
    private String productName;
    private boolean isForSale;
    private int frequency;
    private int numberOfCores;

    public Processor(int id, String productName, boolean isForSale, int frequency, int numberOfCores) {
        this.id = id;
        this.productName = productName;
        this.isForSale = isForSale;
        this.frequency = frequency;
        this.numberOfCores = numberOfCores;
    }

    @Override
    public void describe() {
        System.out.printf("Name: %s(ID: %d)\n\tFrequency: %d hz\n\tNumber of Cores: %d",
                productName, id, frequency, numberOfCores);

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public boolean isForSale() {
        return isForSale;
    }

    public void setForSale(boolean forSale) {
        isForSale = forSale;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    public int getNumberOfCores() {
        return numberOfCores;
    }

    public void setNumberOfCores(int numberOfCores) {
        this.numberOfCores = numberOfCores;
    }
}
