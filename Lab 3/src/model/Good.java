package model;

public class Good {
    protected String name;
    protected double priceInUAH;
    protected String producer;
    protected String producingCountry;
    protected String material;
    protected Purpose purpose;


    public Good() {
        this(null, 0, null, null, null, null);
    }

    public Good(String name, double priceInUAH, String producer, String producingCountry, String material, Purpose purpose) {
        this.name = name;
        this.priceInUAH = priceInUAH;
        this.producer = producer;
        this.producingCountry = producingCountry;
        this.material = material;
        this.purpose = purpose;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPriceInUAH() {
        return priceInUAH;
    }

    public void setPriceInUAH(double priceInUAH) {
        this.priceInUAH = priceInUAH;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getProducingCountry() {
        return producingCountry;
    }

    public void setProducingCountry(String producingCountry) {
        this.producingCountry = producingCountry;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public Purpose getPurpose() {
        return purpose;
    }

    public void setPurpose(Purpose purpose) {
        this.purpose = purpose;
    }



    public boolean equal(Object obj){
        return((Good) obj).getName().compareTo(name)==0 && ((Good) obj).getProducer().compareTo(producer)==0
                && ((Good) obj).getPriceInUAH()==(priceInUAH)&&((Good) obj).getMaterial().compareTo(material)==0
                && ((Good) obj).getProducingCountry().compareTo(producingCountry)==0
                && ((Good) obj).getPurpose().compareTo(purpose)==0;
    }


    @Override
    public String toString() {
        return
                "Name=" + name + ' ' +
                "PriceInUAH=" + priceInUAH + ' '+
                "Producer=" + producer + ' ' +
                "ProducingCountry=" + producingCountry + ' ' +
                "Material=" + material + ' ' +
                "Purpose=" + purpose;
    }
}
