package StreamsOperations;

import java.util.Objects;

public class Product {
    private String name;
    private Double price;

    private Integer rank;

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(name, product.name) && Objects.equals(price, product.price) && Objects.equals(rank, product.rank);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, rank);
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public Product(String name, Double price, Integer rank) {
        this.name = name;
        this.price = price;
        this.rank = rank;
    }

}
