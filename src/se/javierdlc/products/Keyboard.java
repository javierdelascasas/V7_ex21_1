package se.javierdlc.products;

public class Keyboard implements Product {
    private int id;
    private String productName;
    private boolean isForSale;
    private boolean gotNumericKeypad;
    private String color;
    private boolean isWireless;

    public Keyboard(int id, String productName, boolean isForSale, boolean gotNumericKeypad, String color, boolean isWireless) {
        this.id = id;
        this.productName = productName;
        this.isForSale = isForSale;
        this.gotNumericKeypad = gotNumericKeypad;
        this.color = color;
        this.isWireless = isWireless;
    }

    @Override
    public void describe() {
        System.out.printf("Name: %s(ID: %d)\n\tNumeric Keypad: %s hz\n\tColor: %s\n\tWireless: %s",
                productName, id, gotNumericKeypad, color, isWireless);
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

    public boolean isGotNumericKeypad() {
        return gotNumericKeypad;
    }

    public void setGotNumericKeypad(boolean gotNumericKeypad) {
        this.gotNumericKeypad = gotNumericKeypad;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isWireless() {
        return isWireless;
    }

    public void setWireless(boolean wireless) {
        isWireless = wireless;
    }
}
