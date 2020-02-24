package model;

import model.Good;
import model.Purpose;
import model.Size;

public class Uniform extends Good {
    private String category;
    private Size size;

    public Uniform(String category, Size size) {
        super();
        this.category = category;
        this.size = size;
    }

    public Uniform(String name, double priceInUAH, String producer, String producingCountry, String material, Purpose purpose, String category, Size size) {
        super(name, priceInUAH, producer, producingCountry, material, purpose);
        this.category = category;
        this.size = size;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return super.toString() +" "+
                "Category=" + category + ' ' +
                "Size=" + size;
    }

}
