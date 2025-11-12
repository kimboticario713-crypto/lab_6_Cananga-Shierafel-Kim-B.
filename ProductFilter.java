import java.util.*;
import java.util.stream.*;

class Product {
    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;

    }
}

public class ProductFilter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        List<Product> products = new ArrayList<>();
        products.add(new Product("Laptop", 75000.00));
        products.add(new Product("Mouse", 500.00));
        products.add(new Product("Keybord", 1200.00));
        products.add(new Product("Headphones", 2500.00));
        products.add(new Product("Smartphone", 15000.00));

        System.out.print("Enter the minimum price:");

        double limit = input.nextDouble();
        long count = products.stream().filter(product ->product.price >limit).count();

        System.out.println("\nNumber of products above" + limit + ":" + count);

        input.close();
        }
}
