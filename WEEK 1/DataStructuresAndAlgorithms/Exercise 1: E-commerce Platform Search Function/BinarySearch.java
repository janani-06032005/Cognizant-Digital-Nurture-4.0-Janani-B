import java.util.Arrays;
import java.util.Comparator;

public class BinarySearch {
    public static Product search(Product[] products, int targetId) {
        // Sort by product ID before binary search
        Arrays.sort(products, Comparator.comparingInt(p -> p.id));
        int low = 0, high = products.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (products[mid].id == targetId) {
                return products[mid];
            } else if (products[mid].id < targetId) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return null;
    }
}
