package doubleinh;
import java.util.Scanner;

interface Personal {
    void displayPersonalDetails();
}

interface Official {
    void displayOfficialDetails();
}

class Employee implements Personal, Official {
    private String name;
    private int age;
    private String designation;
    private String department;

    public Employee(String name, int age, String designation, String department) {
        this.name = name;
        this.age = age;
        this.designation = designation;
        this.department = department;
    }

    public void displayPersonalDetails() {
        System.out.println("\nPersonal Information:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
   
    public void displayOfficialDetails() {
        System.out.println("\nOfficial Information:");
        System.out.println("Designation: " + designation);
        System.out.println("Department: " + department);
    }
}

public class MultipleInterfaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();
        sc.nextLine(); 

        System.out.print("Enter Designation: ");
        String designation = sc.nextLine();

        System.out.print("Enter Department: ");
        String department = sc.nextLine();

        Employee emp = new Employee(name, age, designation, department);

        emp.displayPersonalDetails();
        emp.displayOfficialDetails();

        sc.close(); 
    }
}