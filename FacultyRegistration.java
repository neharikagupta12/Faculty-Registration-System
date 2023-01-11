import java.util.Scanner;

public class FacultyRegistration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Faculty[] faculty = new Faculty[100];
        int numFaculty = 0;

        while (true) {
            System.out.println("1. Register a new faculty member");
            System.out.println("2. View all faculty members");
            System.out.println("3. Exit");
            System.out.print("Enter a choice: ");
            int choice = sc.nextInt();

            if (choice == 1) {
                // Register a new faculty member
                System.out.print("Enter the name of the faculty member: ");
                String name = sc.next();
                System.out.print("Enter the age of the faculty member: ");
                int age = sc.nextInt();
                System.out.print("Enter the phone number of the faculty member: ");
                String phone = sc.next();
                System.out.print("Enter the address of the faculty member: ");
                String address = sc.next();

                faculty[numFaculty++] = new Faculty(name, age, phone, address);
                System.out.println("Faculty member registered successfully.");
            } else if (choice == 2) {
                // View all faculty members
                System.out.println("Faculty members:");
                for (int i = 0; i < numFaculty; i++) {
                    System.out.println(faculty[i]);
                }
            } else if (choice == 3) {
                // Exit the program
                break;
            } else {
                System.out.println("Invalid choice.");
            }
        }
    }
}

class Faculty {
    private String name;
    private int age;
    private String phone;
    private String address;

    public Faculty(String name, int age, String phone, String address) {
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.address = address;
    }

    public String toString() {
        return name + " (" + age + ") " + phone + " " + address;
    }
}