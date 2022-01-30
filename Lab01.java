package lab01;

import java.time.LocalDate;

public class Lab01 {

    public static void main(String[] args) {
        // Q1
        Product p1 = new FoodProduct(6745, 5.50, "Penne Pasta", LocalDate.parse("2022-06-07"));
        Product p2 = new FoodProduct(8853, 6.50, "Spaghetti Pasta", LocalDate.parse("2022-06-07"));
        Product p3 = new FoodProduct(2106, 4.50, "Linguine Pasta", LocalDate.parse("2022-06-07"));
        Product.printTotalQuantity();

        
        // Q3
        FoodProduct p4 = new FoodProduct(3452, 10.0, "Cheddar Cheese",
                LocalDate.parse("2022-06-07"));
        ElectricProduct p5 = new ElectricProduct(4875, 30.0, "Extension cord", "220v");
        
        
        // Q4
        Product[] productList = {p1, p2, p3, p4, p5};
        for(Product p : productList){
            System.out.println(p.toString());
        }
    }

}

public abstract class Product {

    private int id;
    private double price;
    private String name;
    private static int quantity;

    public Product(int id, double price, String name) {
        this.id = id;
        this.price = price;
        this.name = name;
        this.quantity++;
    }

    public void applySaleDiscount(double percentage) {
        this.price = this.price - ((percentage / 100) * this.price);
    }

    final public void addToShoppingCart() {
        System.out.println(this.name + " has been added to the shopping cart.");
    }

    public static void printTotalQuantity() {
        System.out.println("Total Quantity: " + quantity);
    }

    public void getSellableStatus() {
        System.out.println("This product is sellable");
    }

    public String toString() {
        return "Product info:\n+Id: " + this.id + "\t" + "name: " + this.name
                + "\tPrice: SR" + this.price;
    }

    public static int getQuantity() {
        return quantity;
    }
    
    
}

public class ElectricProduct extends Product {

    private String voltage;

    public ElectricProduct(int id, double price, String name, String voltage) {
        super(id, price, name);
        this.voltage = voltage;
    }

    @Override
    public String toString() {
        return super.toString() + "\t Voltage: " + this.voltage;
    }
}

public class FoodProduct extends Product {

    private LocalDate expirationDate;

    public FoodProduct(int id, double price, String name, LocalDate expirationDate) {
        super(id, price, name);
        this.expirationDate = expirationDate;
    }

    @Override
    public String toString() {
        return super.toString() + "\t Expiration Date: " + this.expirationDate;
    }
}

