public class OptimizedForecast {

    // Optimized version using an array to avoid repeated calculations
    public static double calculateFutureValue(double amount, double rate, int years) {
        double[] memo = new double[years + 1];
        memo[0] = amount;

        for (int i = 1; i <= years; i++) {
            memo[i] = memo[i - 1] * (1 + rate);
        }

        return memo[years];
    }
}
