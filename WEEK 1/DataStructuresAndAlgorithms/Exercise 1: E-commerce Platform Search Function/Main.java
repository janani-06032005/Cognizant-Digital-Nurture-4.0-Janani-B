public class Main {
    public static void main(String[] args) {
        Product[] products = {
                new Product(3, "Laptop", "Electronics"),
                new Product(1, "Shirt", "Clothing"),
                new Product(5, "Phone", "Electronics"),
                new Product(2, "Book", "Education"),
                new Product(4, "Shoes", "Footwear")
        };

        int targetId = 5;

        System.out.println("=== Linear Search ===");
        Product result1 = LinearSearch.search(products, targetId);
        System.out.println(result1 != null ? "Found: " + result1 : "Not found");

        System.out.println("\n=== Binary Search ===");
        Product result2 = BinarySearch.search(products, targetId);
        System.out.println(result2 != null ? "Found: " + result2 : "Not found");
    }
}
