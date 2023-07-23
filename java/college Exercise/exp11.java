import java.util.Scanner;
class Person {
    private String name;
    private String aadharNumber;
    public Person(String name, String aadharNumber) {
        this.name = name;
        this.aadharNumber = aadharNumber;
    }
    public String getName() {
        return name;
    }
    public String getAadharNumber() {
        return aadharNumber;
    }
}
class Student extends Person {
    private String studentId;
    public Student(String name, String aadharNumber, String studentId) {
        super(name, aadharNumber);
        this.studentId = studentId;
    }
    public String getStudentId() {
        return studentId;
    }
}
class Employee extends Person {
    private String employeeId;
    public Employee(String name, String aadharNumber, String employeeId) {
        super(name, aadharNumber);
        this.employeeId = employeeId;
    }
    public String getEmployeeId() {
        return employeeId;
    }
}
public class exp11 {
    public static void main(String[] args) {
        Person[] people = new Person[4];
        Student student1 = new Student("sumit", "1234567890", "S1");
        Student student2 = new Student("behera", "9876543210", "S2");
        Employee employee1 = new Employee("Michael", "6666666666", "E1");
        Employee employee2 = new Employee("sk", "88888888888", "E2");
        people[0] = student1;
        people[1] = student2;
        people[2] = employee1;
        people[3] = employee2;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the AADHAR number to search: ");
        String searchAadhar = scanner.nextLine();
        boolean found = false;
        for (Person person : people) {
            if (person.getAadharNumber().equals(searchAadhar)) {
                found = true;
                if (person instanceof Student) {
                    Student student = (Student) person;
                    System.out.println("Student Details:");
                    System.out.println("Name: " + student.getName());
                    System.out.println("AADHAR Number: " + student.getAadharNumber());
                    System.out.println("Student ID: " + student.getStudentId());
                } else if (person instanceof Employee) {
                    Employee employee = (Employee) person;
                    System.out.println("Employee Details:");
                    System.out.println("Name: " + employee.getName());
                    System.out.println("AADHAR Number: " + employee.getAadharNumber());
                    System.out.println("Employee ID: " + employee.getEmployeeId());
                }
                break;
            }
        }

        if (!found) {
            System.out.println("Person with the given AADHAR number not found.");
        }

        scanner.close();
    }
}
