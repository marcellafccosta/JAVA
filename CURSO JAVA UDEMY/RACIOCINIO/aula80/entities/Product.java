package entities;

public class Product {
    
    private String name;
    private double price;
    private int quantity;

    // construtor padrao
    public Product() {
    }

    // construtor
    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // construtor 2
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }


    // metodos para name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // metodos para price
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // metodo para quantity
    public int getQuantity() {
        return quantity;
    }

    // metodos
    public double totalValueInStock() {
        return price * quantity;
    }

    public void addProducts(int quantity) {
        // this - autoreferencia para o objeto. quero acessar oa tributo da classe, nao
        // o parametro
        this.quantity += quantity;
    }

    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }

    public String toString() {
        return name + ", $" + String.format("%.2f", price) + ", " + quantity + " units, total: $"
                + String.format("%.2f", totalValueInStock());
    }
}