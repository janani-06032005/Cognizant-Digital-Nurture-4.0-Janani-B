public class Forecast {

    // Simple recursive method to calculate future value
    public static double calculateFutureValue(double amount, double rate, int years) {
        if (years == 0) {
            return amount; // base case
        }
        return calculateFutureValue(amount, rate, years - 1) * (1 + rate);
    }
}

