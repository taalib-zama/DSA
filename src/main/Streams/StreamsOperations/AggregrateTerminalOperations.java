package StreamsOperations;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class AggregrateTerminalOperations {

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Product A", 20.0, 2));
        products.add(new Product("Product B", 10.0, 1));
        products.add(new Product("Product C", 15.0, 3));
        products.add(new Product("Product C", 10.0, 4));

        // Calculate the total price of all products
        Long totalPrice = products.stream()
                .filter(product -> product.getPrice() < 20.0) // Filter products with price greater than 10.0
                .collect(Collectors.counting());

        //collecting total price
        Double price = products.stream().collect(Collectors.summingDouble(product -> product.getPrice()));

        //average
        Double averagePrice = products.stream().collect(Collectors.averagingDouble(product -> product.getPrice()));
        System.out.println("Average Price: " + averagePrice);

        //we have an ArrayList of Employee objects and we need to find the Product object with a minimum price.
        Optional<Product> minPriceProduct = products.stream()
                .min(Comparator.comparing(Product::getPrice));
        System.out.println();

        //grouping operations.

    }
}
