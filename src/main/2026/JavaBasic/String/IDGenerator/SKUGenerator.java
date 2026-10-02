package JavaBasic.String.IDGenerator;

public class SKUGenerator {
    // TODO: Implement the generateSKU method
    public static String generateSKU(String productName, int id) {

        // TODO: Extract first 3 chars


        // TODO: Extract last 2 chars

        // TODO: Use StringBuilder to combine parts

        // TODO: Return the result
        StringBuilder result = new StringBuilder().append(productName.substring(0, 3).toUpperCase()).append("-").append(id).append("-").
                append(productName.substring(productName.length() - 2).toUpperCase());
        return result.toString(); // Placeholder
    }

    public static void main(String[] args) {
        // Test Data
        String item = "Gaming Laptop";
        int id = 5510;

        // Testing the method
        String result = generateSKU(item, id);
        System.out.println("Input: " + item);
        System.out.println("Generated SKU: " + result);
    }
}
