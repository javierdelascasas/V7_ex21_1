package se.javierdlc.products.video;

import se.javierdlc.products.Product;

public class Monitor implements Product {
    private int id;
    private String productName;
    public boolean isForSale;
    private int size;
    private float weight;

    public Monitor(int id, String productName, boolean isForSale, int size, float weight) {
        this.id = id;
        this.productName = productName;
        this.isForSale = isForSale;
        this.size = size;
        this.weight = weight;
    }

    @Override
    public void describe() {
        System.out.printf("Name: %s(ID: %d)\n\tSize: %d hz\n\tWeight: %f",
                productName, id, size, weight);
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

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }
}
