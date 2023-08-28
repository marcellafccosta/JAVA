package entities;

public class Employee {
    public String name;
    public double grossSalary;
    public double tax;

    public double netSalary() {
        return grossSalary - tax;
    }

    public void increaseSalary(double porcentagem) {
        double aumento = (grossSalary * porcentagem) / 100;
        grossSalary += aumento;
    }

    public String toString() {
        return "employee: " + name + ", $" + netSalary();
    }
}
