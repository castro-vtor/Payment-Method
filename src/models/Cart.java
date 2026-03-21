package models;

public class Cart {
    private final String nameProduct;
    private final double price;

    public Cart(String product, double price){
        this.nameProduct = product;
        this.price = price;
    }

    @Override
    public String toString() {
        return "    " + this.nameProduct + " - R$" + this.price;
    }
}
