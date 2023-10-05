package Exercise3;

import java.util.Arrays;

public class ManagerTest {
    public static void main(String[] args) {
        Employee[] staff = new Employee[4];
        staff[0] = new Employee("Antonio Rossi", 2000000, 1, 10, 1989);
        staff[1] = new Manager("Maria Bianchi", 2500000, 1, 12, 1991);
        staff[2] = new Employee("Isabel Vidal", 3000000, 1, 11, 1993);
        staff[3] = new Manager("Julya Claire-Anderson", 150000, 1, 4, 1975);
//        System.out.println(Arrays.toString(staff));

        Employee.shell_sort(staff);

        int i;
        for (i = 0; i < 4; i++) staff[i].raiseSalary(5);
        for (i = 0; i < 4; i++) staff[i].print();

//        System.out.println(Arrays.toString(staff));
    }
}
