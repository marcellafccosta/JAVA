package entities;

public class Product {
    public String name;
    public double price;
    public int quantity;


    //construtor
    public Product(String name, double price, int quantity) {
       this.name = name;
       this.price = price;
       this.quantity = quantity;
    }

    //construtor 2
    public Product(String name, double price) {
       this.name = name;
       this.price = price;
    }

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