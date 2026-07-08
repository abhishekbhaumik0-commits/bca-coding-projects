import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    static int id[] = new int[1000];
    static String name[] = new String[1000];
    static double salary[] = new double[1000];
    static int count = 0;

    public static void main(String[] args) {

        while (true) {

            System.out.println("\n===== Employee Management System =====");
            System.out.println("1. Insert Employee");
            System.out.println("2. Display Employees");
            System.out.println("3. Search Employee");
            System.out.println("4. Update Employee");
            System.out.println("5. Delete Employee");
            System.out.println("6. Highest Salary");
            System.out.println("7. Lowest Salary");
            System.out.println("8. Average Salary");
            System.out.println("9. Count Employees");
            System.out.println("10. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    insertEmployee();
                    break;

                case 2:
                    displayEmployee();
                    break;

                case 3:
                    searchEmployee();
                    break;

                case 4:
                    updateEmployee();
                    break;

                case 5:
                    deleteEmployee();
                    break;

                case 6:
                    highestSalary();
                    break;

                case 7:
                    lowestSalary();
                    break;

                case 8:
                    averageSalary();
                    break;

                case 9:
                    countEmployee();
                    break;

                case 10:
                    System.out.println("Thank You!");
                    return;

                default:
                    System.out.println("Invalid Choice.");
            }
        }
    }

    static void insertEmployee() {

        if (count == id.length) {
            System.out.println("Employee List is Full.");
            return;
        }

        System.out.print("Enter Employee ID: ");
        int newId = sc.nextInt();

        for (int i = 0; i < count; i++) {
            if (id[i] == newId) {
                System.out.println("Employee ID Already Exists.");
                return;
            }
        }

        id[count] = newId;

        sc.nextLine();

        System.out.print("Enter Employee Name: ");
        name[count] = sc.nextLine();

        System.out.print("Enter Salary: ");
        salary[count] = sc.nextDouble();

        count++;

        System.out.println("Employee Added Successfully.");
    }

    static void displayEmployee() {

        if (count == 0) {
            System.out.println("No Employees Available.");
            return;
        }

        System.out.println("\nID\tName\tSalary");

        for (int i = 0; i < count; i++) {
            System.out.println(id[i] + "\t" + name[i] + "\t" + salary[i]);
        }
    }

    static void searchEmployee() {

        System.out.print("Enter Employee ID: ");
        int search = sc.nextInt();

        for (int i = 0; i < count; i++) {

            if (id[i] == search) {

                System.out.println("Employee Found");
                System.out.println("ID : " + id[i]);
                System.out.println("Name : " + name[i]);
                System.out.println("Salary : " + salary[i]);
                return;
            }
        }

        System.out.println("Employee Not Found.");
    }

    static void updateEmployee() {

        System.out.print("Enter Employee ID: ");
        int search = sc.nextInt();

        for (int i = 0; i < count; i++) {

            if (id[i] == search) {

                sc.nextLine();

                System.out.print("Enter New Name: ");
                name[i] = sc.nextLine();

                System.out.print("Enter New Salary: ");
                salary[i] = sc.nextDouble();

                System.out.println("Employee Updated Successfully.");
                return;
            }
        }

        System.out.println("Employee Not Found.");
    }

    static void deleteEmployee() {

        System.out.print("Enter Employee ID: ");
        int search = sc.nextInt();

        for (int i = 0; i < count; i++) {

            if (id[i] == search) {

                for (int j = i; j < count - 1; j++) {
                    id[j] = id[j + 1];
                    name[j] = name[j + 1];
                    salary[j] = salary[j + 1];
                }

                count--;

                System.out.println("Employee Deleted Successfully.");
                return;
            }
        }

        System.out.println("Employee Not Found.");
    }

    static void highestSalary() {

        if (count == 0) {
            System.out.println("No Employees Available.");
            return;
        }

        double max = salary[0];
        int index = 0;

        for (int i = 1; i < count; i++) {

            if (salary[i] > max) {
                max = salary[i];
                index = i;
            }
        }

        System.out.println("Highest Salary Employee");
        System.out.println("ID : " + id[index]);
        System.out.println("Name : " + name[index]);
        System.out.println("Salary : " + salary[index]);
    }

    static void lowestSalary() {

        if (count == 0) {
            System.out.println("No Employees Available.");
            return;
        }

        double min = salary[0];
        int index = 0;

        for (int i = 1; i < count; i++) {

            if (salary[i] < min) {
                min = salary[i];
                index = i;
            }
        }

        System.out.println("Lowest Salary Employee");
        System.out.println("ID : " + id[index]);
        System.out.println("Name : " + name[index]);
        System.out.println("Salary : " + salary[index]);
    }

    static void averageSalary() {

        if (count == 0) {
            System.out.println("No Employees Available.");
            return;
        }

        double sum = 0;

        for (int i = 0; i < count; i++) {
            sum += salary[i];
        }

        double average = sum / count;

        System.out.println("Average Salary = " + average);
    }

    static void countEmployee() {

        System.out.println("Total Employees = " + count);
    }
}
