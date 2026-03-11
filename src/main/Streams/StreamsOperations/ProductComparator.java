package StreamsOperations;

import java.util.Comparator;

public class ProductComparator  implements Comparator<Product> {
    @Override
    public int compare(Product p1, Product p2) {
        int priceComparison = p1.getPrice().compareTo(p2.getPrice());
        if (priceComparison != 0) {
            return priceComparison;
        }
        return p1.getRank().compareTo(p2.getRank());
    }
}
