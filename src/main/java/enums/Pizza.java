package enums;

//Enumeration of Pizza Sizes
enum PizzaSize {
    SMALL, MEDIUM, LARGE
}

class  Pizza {
    private String pizzaName;
    private double price;
    //can take only three values SMALL, MEDIUM, LARGE. Anyother value will give error
    private PizzaSize size;

    public Pizza(String pizzaName, double price, PizzaSize size) {
        this.pizzaName = pizzaName;
        this.price = price;
        this.size = size;
    }

    public double checkDiscount() {
        PizzaSize currentSize = this.size;
        double discount = 0;

        // enum can be used in switch case
        switch (currentSize) {
            case SMALL:
                discount = 10;
                break;
            case MEDIUM:
                discount = 20.5;
                break;
            case LARGE:
                discount = 30.2;
                break;
        }
        return discount;
    }

    public static void main(String[] args) {
        Pizza myPizza = new Pizza("VegFeast", 500, PizzaSize.MEDIUM);
        System.out.println("Discount:" + myPizza.checkDiscount());

        // displaying all Pizza sizes
        //values() method returns an array of all values inside enum
        //ordinal() method can be used to display values assigned to enum constants
        for (PizzaSize psize : PizzaSize.values()) {
            System.out.println(psize + " " + psize.ordinal());
        }


    }
}