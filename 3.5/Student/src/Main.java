import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numStudents = scanner.nextInt();
        scanner.nextLine(); // Consume the rest of the line

        Student[] students = new Student[numStudents];

        for (int i = 0; i < numStudents; i++) {
            System.out.println("Enter student ID:");
            String studentID = scanner.nextLine();
            System.out.println("Enter student name:");
            String studentName = scanner.nextLine();
            System.out.println("Enter the number of extra activities:");
            int numExtraActivities = scanner.nextInt();
            scanner.nextLine(); // Consume the rest of the line

            students[i] = new Student(studentID, studentName, numExtraActivities);

            for (int j = 0; j < numExtraActivities; j++) {
                System.out.println("Enter extra activity #" + (j + 1) + ":");
                String extraActivity = scanner.nextLine();
                students[i].addExtraActivity(extraActivity);
            }
        }

        // Display the details of all students
        for (Student student : students) {
            System.out.println(student.toString());
        }

        scanner.close();
    }
}
