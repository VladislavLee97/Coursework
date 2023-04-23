public class Main {
    public static void add(Employee[] employees, Employee newEmployee) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = newEmployee;
                break;
            }
        }
    }

    public static void monthlySalaryExpenses(Employee[] employees) {
        int sum = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                sum = sum + employees[i].getSalary();
            }
        }
        System.out.println("Сумма затрат на зарплаты в месяц составляет" + sum);
    }

    public static void employeeWithMinSalary(Employee[] employees) {
        int min = Integer.MAX_VALUE;
        int minSalaryIndex = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getSalary() < min) {
                min = employees[i].getSalary();
                minSalaryIndex = employees[i].getId();
            }
        }
        System.out.println("Сотрудник минимальной зарплатой " + minSalaryIndex);
    }

    public static void employeeWithMaxSalary(Employee[] employees) {
        int max = Integer.MIN_VALUE;
        int maxSalaryIndex = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getSalary() > max) {
                max = employees[i].getSalary();
                maxSalaryIndex = employees[i].getId();
            }
        }
        System.out.println("Сотрудник с максимальной зарплатой " + maxSalaryIndex);
    }

    public static void employeeWithAverageSalary(Employee[] employees) {
        int sum = 0;
        int avgSalaryIndex = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                sum = sum + employees[i].getSalary();
            }
            avgSalaryIndex = sum / employees.length;
        }
        System.out.println("Средняя сумма затрат на зарплаты в месяц составляет " + avgSalaryIndex );
    }

    public static void theListOfEmployees(Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                System.out.println(employees[i].toString());
            }
        }
    }

    public static void fullnameEmployees(Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                System.out.println(employees[i].getFullName());
            }
        }
    }

    public static void main(String[] args) {
        Employee[] employee = new Employee[10];
        add(employee, new Employee("Ли Владислав", 1, 100));
        add(employee, new Employee("Климов Дмитрий", 2, 400500));
        add(employee, new Employee("Глинка Александра", 3, 200320));
        add(employee, new Employee("Сердюк Тарас", 4, 200000));
        add(employee, new Employee("Кузнецова Анастасия", 5, 204000));
        add(employee, new Employee("Дрига Анна", 5, 250000));
        add(employee, new Employee("Назаров Артем", 2, 412000));
        add(employee, new Employee("Гарава Денис", 1, 150000));
        add(employee, new Employee("Макашова Елена", 1, 510000));
        add(employee, new Employee("Дубиновская Елеоонора", 1, 299000));

        theListOfEmployees(employee);
        monthlySalaryExpenses(employee);
        employeeWithMinSalary(employee);
        employeeWithMaxSalary(employee);
        employeeWithAverageSalary(employee);
        fullnameEmployees(employee);
    }
}