public class Employee {

    // instance variables
    private String name;
    private Double salary;
    private double workingHours;
    private int hireYear;

    // constructor method
    Employee(String name, Double salary, double workingHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workingHours = workingHours;
        this.hireYear = hireYear;
    }

    // calculating salary after tax
    public double taxRate(double salary) {
        return (salary < 1000) ? 1 : 0.97;
    }

    // calculating salary after bonus
    public double bonus(double workingHours) {
        if (workingHours > 40) {
            return (workingHours - 40) * 30;
        } else {
            return 0;
        }
    }

    // calculating salary after raise
    public double raiseRate(int hireYear) {
        int currentYear = 2024;
        if (currentYear - hireYear < 10) {
            return 1.05;
        } else if (currentYear - hireYear < 20) {
            return 1.10;
        } else {
            return 1.15;
        }
    }

    // calculating final salary
    public double calculateSalary(double salary, int hireYear, double workingHours) {
        double raiseRate = raiseRate(hireYear);
        double bonus = bonus(workingHours);
        double salaryBeforeTax = (salary + bonus) * raiseRate;
        double taxRate = taxRate(salaryBeforeTax);
        return salaryBeforeTax * taxRate;
    }

    // get employee info
    public String toString() {
        return "- Employee Info -\n" +
                "Employee Name: " + this.name + "\n" +
                "Working Hours: " + this.workingHours + "\n" +
                "Hire Year: " + this.hireYear + "\n" +
                "Base Salary: " + this.salary + "\n" +
                "   - Tax Rate: " + taxRate(this.salary) + "\n" +
                "   - Bonus Amount: " + bonus(this.workingHours) + "\n" +
                "   - Raise Rate: " + raiseRate(this.hireYear) + "\n" +
                "Salary: " + calculateSalary(salary, hireYear, workingHours) + "\n";
    }

    // setter and getter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public void setWorkingHours(double workingHours) {
        this.workingHours = workingHours;
    }


    public void setHireYear(int hireYear) {
        this.hireYear = hireYear;
    }


}
