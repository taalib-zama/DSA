package StreamsOperations;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class ProductComapratorExample {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Product A", 20.0, 2));
        products.add(new Product("Product B", 10.0, 1));
        products.add(new Product("Product C", 15.0, 3));
        products.add(new Product("Product C", 10.0, 4));

        // Sorting by price, then by rank
        products.sort(Comparator.comparing(Product::getPrice).thenComparing(Product::getRank));
        products.forEach(product -> System.out.println(product.getName() + " - " + product.getPrice() + " - " + product.getRank()));


        //find product with the highest rank :
        Product highestRankProduct = products.stream()
                .max(Comparator.comparing(Product::getRank))
                .orElse(null);
        System.out.println("Product with the highest rank: " + highestRankProduct.getName() + " - " + highestRankProduct.getPrice() + " - " + highestRankProduct.getRank());


        //use separator comparator class if it needs to be reused in multiple places
            /*products.sort(new ProductComparator());
            products.forEach(product -> System.out.println(product.getName() + " - " + product.getPrice() + " - " + product.getRank()));

             */


            //getting all product names.
        Set<String> uniqueProductNames = products.stream().map(product -> product.getName())
                .collect(Collectors.toSet());


        //hashmap to store product name as key and product object as value
        Map<Integer, Product> productMap = products.stream()
                .collect(Collectors.toMap(product -> product.getRank(), product -> product));


        List<String> unmodifiableProductList = products.stream().map(product -> product.getName())
                .collect(Collectors.collectingAndThen(Collectors.toList(), Collections::unmodifiableList));

        try{
            unmodifiableProductList.add("New Product");
        }
        catch (UnsupportedOperationException e){
            System.out.println("Cannot modify unmodifiable list: " + e.getMessage());
        }
  }
}
