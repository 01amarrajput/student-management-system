import java.util.Scanner;

public class StudentApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StudentDAO dao = new StudentDAO();
        int choice;

        do {
            System.out.println("\n===== STUDENT MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Update Student Percentage");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    sc.nextLine();
                    System.out.print("Name: ");
                    String name = sc.nextLine();
                    System.out.print("Email: ");
                    String email = sc.nextLine();
                    System.out.print("Course: ");
                    String course = sc.nextLine();
                    System.out.print("Percentage: ");
                    double per = sc.nextDouble();

                    dao.addStudent(new Student(name, email, course, per));
                    break;

                case 2:
                    dao.viewStudents();
                    break;

                case 3:
                    System.out.print("Student ID: ");
                    int id = sc.nextInt();
                    System.out.print("New Percentage: ");
                    double p = sc.nextDouble();
                    dao.updateStudent(id, p);
                    break;

                case 4:
                    System.out.print("Student ID: ");
                    dao.deleteStudent(sc.nextInt());
                    break;

                case 5:
                    System.out.println("Exiting application...");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 5);

        sc.close();
    }
}
