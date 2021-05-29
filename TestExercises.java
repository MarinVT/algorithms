import java.util.*;

public class TestExercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the investment amount: ");
        double investment = scanner.nextDouble();
        System.out.print("Input the rate of interest: ");
        double rate = scanner.nextDouble();
        System.out.print("Input number of years: ");
        int year = scanner.nextInt();

        rate *= 0.01;
        System.out.println("Years FutureValue");
        for (int i = 1; i <= year; i++) {
            int formatter = 19;
            if (i >= 10) formatter = 18;
            System.out.printf(i + "%" + formatter + ".2f\n", futureInvestmentsValue(investment, rate/12, i));
        }


    }
    public static double futureInvestmentsValue(double investments, double mounthlyInterestRate, int years) {
        return investments * Math.pow(1 + mounthlyInterestRate, years * 12);
    }
}
