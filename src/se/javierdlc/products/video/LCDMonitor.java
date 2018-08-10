package se.javierdlc.products.video;

public class LCDMonitor extends Monitor {
    private boolean touchEnabled;
    private boolean vesaMount;
    private boolean hasSpeaker;

    public LCDMonitor(int id, String productName, boolean isForSale, int size, float weight, boolean touchEnabled, boolean vesaMount, boolean hasSpeaker) {
        super(id, productName, isForSale, size, weight);
        this.touchEnabled = touchEnabled;
        this.vesaMount = vesaMount;
        this.hasSpeaker = hasSpeaker;
    }

    public void print() {
        System.out.println("ID: " + this.getId());
        System.out.println("Product Name: " + this.getProductName());
        System.out.println("Size: " + this.getSize());
        System.out.println("Weight: " + this.getWeight());
        System.out.println("Touch: " + this.isTouchEnabled());
        System.out.println("Speaker: " + this.isHasSpeaker());
    }

    public boolean isTouchEnabled() {
        return touchEnabled;
    }

    public void setTouchEnabled(boolean touchEnabled) {
        this.touchEnabled = touchEnabled;
    }

    public boolean isVesaMount() {
        return vesaMount;
    }

    public void setVesaMount(boolean vesaMount) {
        this.vesaMount = vesaMount;
    }

    public boolean isHasSpeaker() {
        return hasSpeaker;
    }

    public void setHasSpeaker(boolean hasSpeaker) {
        this.hasSpeaker = hasSpeaker;
    }
}
