import java.util.*;

public class searchStudent {
    // This method can be used as into SmartCampus
    public static void search(ArrayList<Student> students, Scanner sc) {
        System.out.print("Enter Student ID: ");
        int id = sc.nextInt();

        for (Student s : students) {
            if (s.studentId == id) {
                System.out.println("Found: " + s);
                return;
            }
        }
        System.out.println("Student not found!");
    }
}