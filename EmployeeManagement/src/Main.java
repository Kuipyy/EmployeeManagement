import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the employee name: ");
        String name = input.nextLine();

        System.out.print("Enter base salary: ");
        double salary = input.nextDouble();

        System.out.print("Enter the working hours for week: ");
        int workingHours = input.nextInt();

        System.out.print("Enter the hired year: ");
        int hiredYear = input.nextInt();

        Employee myEmployee = new Employee(name, salary, workingHours, hiredYear);

        System.out.println();

        System.out.println(myEmployee);
    }
}