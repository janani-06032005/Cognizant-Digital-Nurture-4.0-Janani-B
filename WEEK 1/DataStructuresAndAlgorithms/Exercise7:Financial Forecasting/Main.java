public class Main {
    public static void main(String[] args) {
        double initialAmount = 1000.0; // Starting value
        double growthRate = 0.10;      // 10% growth
        int years = 5;                 // Number of years

        System.out.println("=== Simple Recursive Forecast ===");
        double result1 = Forecast.calculateFutureValue(initialAmount, growthRate, years);
        System.out.println("Future Value: ₹" + result1);

        System.out.println("\n=== Optimized Forecast ===");
        double result2 = OptimizedForecast.calculateFutureValue(initialAmount, growthRate, years);
        System.out.println("Future Value: ₹" + result2);
    }
}
