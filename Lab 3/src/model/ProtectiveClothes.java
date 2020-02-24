package model;

public class ProtectiveClothes extends Good {
    private Level protectionLevel;

    public ProtectiveClothes(Level protectionLevel) {
        super();
        this.protectionLevel = protectionLevel;
    }

    public ProtectiveClothes(String name, double priceInUAH, String producer, String producingCountry, String material, Purpose purpose, Level protectionLevel) {
        super(name, priceInUAH, producer, producingCountry, material, purpose);
        this.protectionLevel = protectionLevel;
    }

    public Level getProtectionLevel() {
        return protectionLevel;
    }

    public void setProtectionLevel(Level protectionLevel) {
        this.protectionLevel = protectionLevel;
    }

    @Override
    public String toString() {
        return super.toString() +" "+
                "ProtectionLevel=" + protectionLevel;
    }
}
