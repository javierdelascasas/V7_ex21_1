package se.javierdlc.products.video;

public class CRTMonitor extends Monitor {
    private int refreshRate;
    private boolean enviromentFriendly;

    public CRTMonitor(int id, String productName, boolean isForSale, int size, float weight, int refreshRate, boolean enviromentFriendly) {
        super(id, productName, isForSale, size, weight);
        this.refreshRate = refreshRate;
        this.enviromentFriendly = enviromentFriendly;
    }

    public int getRefreshRate() {
        return refreshRate;
    }

    public void setRefreshRate(int refreshRate) {
        this.refreshRate = refreshRate;
    }

    public boolean isEnviromentFriendly() {
        return enviromentFriendly;
    }

    public void setEnviromentFriendly(boolean enviromentFriendly) {
        this.enviromentFriendly = enviromentFriendly;
    }
}
