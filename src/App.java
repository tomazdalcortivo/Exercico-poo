import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter employee name:");
        String name = scanner.nextLine();

        System.out.println("Enter employee gross salary:");
        double grossSalary = scanner.nextDouble();

        System.out.println("Enter employee tax rate:");
        double tax = scanner.nextDouble();

        Employee employee = new Employee(name, grossSalary, tax);

        System.out.println("\nBefore increase:");
        System.out.println("Name: " + employee.getName());
        System.out.println("Gross Salary: " + employee.getGrossSalary());
        System.out.println("Net Salary: " + employee.netSalary());

        System.out.println("\nEnter the percentage increase for the salary:");
        double increasePercentage = scanner.nextDouble();
        employee.increaseSalary(increasePercentage);

        System.out.println("\nAfter increase:");
        System.out.println("Name: " + employee.getName());
        System.out.println("Gross Salary: " + employee.getGrossSalary());
        System.out.println("Net Salary: " + employee.netSalary());

        scanner.close();
    }
}
