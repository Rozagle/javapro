import java.util.Calendar;

public class Employee {
    // Nitelikler
    private String name;
    private double salary;
    private int workHours;
    private int hireYear;

    // Kurucu Metot
    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    // Vergi Hesaplama Metodu
    public double tax() {
        if (salary > 1000) {
            return 0.03 * salary;
        } else {
            return 0;
        }
    }

    // Bonus Hesaplama Metodu
    public double bonus() {
        if (workHours > 40) {
            int extraHours = workHours - 40;
            return 30 * extraHours;
        } else {
            return 0;
        }
    }

    // Maaş Artışı Hesaplama Metodu
    public double raiseSalary() {
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        int yearsWorked = currentYear - hireYear;

        if (yearsWorked < 10) {
            return 0.05 * salary;
        } else if (yearsWorked < 20) {
            return 0.10 * salary;
        } else {
            return 0.15 * salary;
        }
    }

    // toString Metodu
    @Override
    public String toString() {
        double totalSalary = salary - tax() + bonus() + raiseSalary();

        return "Adı : " + name +
                "\nMaaşı : " + salary +
                "\nÇalışma Saati : " + workHours +
                "\nBaşlangıç Yılı : " + hireYear +
                "\nVergi : " + tax() +
                "\nBonus : " + bonus() +
                "\nMaaş Artışı : " + raiseSalary() +
                "\nVergi ve Bonuslar ile birlikte maaş : " + (totalSalary - salary) +
                "\nToplam Maaş : " + totalSalary;
    }

    // Ana Metot (Test)
    public static void main(String[] args) {
        Employee employee = new Employee("kemal", 2000.0, 45, 1985);
        System.out.println(employee.toString());
    }
}
