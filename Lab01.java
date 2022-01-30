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
