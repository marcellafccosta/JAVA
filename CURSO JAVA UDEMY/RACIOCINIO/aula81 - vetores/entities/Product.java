package entities;

public class Product {
    
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Getter para o nome
    public String getName() {
        return name;
    }

    // Setter para o nome
    public void setName(String name) {
        this.name = name;
    }

    // Getter para o preço
    public double getPrice() {
        return price;
    }

    // Setter para o preço
    public void setPrice(double price) {
        this.price = price;
    }
}
