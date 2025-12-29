package collections.ComparatorAndComparable.InterviewQuestoins.ComparatorVsComparable.UsingDoubleComparator;

//import collections.ComparatorAndComparable.CustomObjComparator.Comparator;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create some products
        Product product1 = new Product(100, "Laptop");
        Product product2 = new Product(50, "Mouse");
        Product product3 = new Product(150, "Keyboard");
        //add products to list.

        // Add products to a list
        List<Product> products = Arrays.asList(product1, product2, product3);


        // Print the products before sorting
        System.out.println("Products before sorting:" + products);


        Comparator<Product> priceComparator = Comparator.comparing(Product::getPrice);
        Comparator<Product> nameComparator = Comparator.comparing(Product::getName);
        // Sort the products by price in ascending order then by name in ascending order
        Collections.sort(products, priceComparator.thenComparing(nameComparator));

        System.out.println("Products after sorting by price and name:" + products);
    }
}
