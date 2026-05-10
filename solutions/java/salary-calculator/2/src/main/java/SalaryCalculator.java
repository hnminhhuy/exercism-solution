public class SalaryCalculator {
    public static final int PENALTY_DAYS = 5;
    public static final double BASE_SALARY = 1000.0;
    public static final double MAX_SALARY = 2000.0;

    public double salaryMultiplier(int daysSkipped) {
        return daysSkipped >= PENALTY_DAYS ? 0.85 : 1.0;
    }

    public int bonusMultiplier(int productsSold) {
        return productsSold >= 20 ? 13 : 10;
    }

    public double bonusForProductsSold(int productsSold) {
        return productsSold * bonusMultiplier(productsSold);
    }

    public double finalSalary(int daysSkipped, int productsSold) {
        double rawSalary = SalaryCalculator.BASE_SALARY * salaryMultiplier(daysSkipped) + bonusForProductsSold(productsSold);
        return rawSalary >= SalaryCalculator.MAX_SALARY ? SalaryCalculator.MAX_SALARY : rawSalary;
    }
}