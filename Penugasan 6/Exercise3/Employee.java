package Exercise3;

public class Employee implements Sortable {
    public int compare(Sortable b) {
        Employee eb = (Employee) b;
        if (this.salary < eb.salary) return -1;
        if (this.salary > eb.salary) return +1;
        return 0;
    }
    public Employee(String n, double s, int day, int month, int year) {
        name = n;
        salary = s;
        hireday = day;
        hiremonth = month;
        hireyear = year;
    }
    public void print() {
        System.out.println(name + " " + salary + " " + hireYear());
    }
    public void raiseSalary(double byPercent) {
        salary *= 1 + byPercent / 100;
    }
    public int hireYear() {
        return hireyear;
    }
    private String name;
    private double salary;
    private int hireday;
    private int hiremonth;
    private int hireyear;
    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=$" + salary +
                '}';
    }
}
