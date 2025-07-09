import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter employee level (1-4): ");
        int level = sc.nextInt();

        double basicSalary = 0;
        double hraPercentage = 0;

        switch (level) {
            case 1:
                basicSalary = 50000;
                hraPercentage = 0.30;
                break;
            case 2:
                basicSalary = 40000;
                hraPercentage = 0.25;
                break;
            case 3:
                basicSalary = 30000;
                hraPercentage = 0.20;
                break;
            case 4:
                basicSalary = 20000;
                hraPercentage = 0.15;
                break;
            default:
                System.out.println("Invalid level entered.");
                return;
        }

        double hra = basicSalary * hraPercentage;
        double totalSalary = basicSalary + hra;

        System.out.println("Basic Salary: ₹" + basicSalary);
        System.out.println("HRA: " + hra);
        System.out.println("Total Salary: " + totalSalary);
    }
}