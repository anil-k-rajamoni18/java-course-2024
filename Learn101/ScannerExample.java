import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in); // object creation

        // next() & nextLine()
        // String data = sc.next();
        // System.out.println(data);

        // String data = sc.nextLine();
        // System.out.println(data);

        System.out.println("Enter Details: ");
        String name = sc.nextLine();
        byte age = sc.nextByte();
        short courseDuration = sc.nextShort();
        int rollNumber = sc.nextInt();
        long applicationId = sc.nextLong();

        float gpa = sc.nextFloat();
        double collegeFee = sc.nextDouble();

        boolean isStudent = sc.nextBoolean();
        char grade = sc.next().charAt(0);

        System.out.println("Name: " + name);
        System.out.println("age: " + age);
        System.out.println("course-duration: " + courseDuration);
        System.out.println("roll-number: " + rollNumber);
        System.out.println("application-id: " + applicationId);
        System.out.println("gpa: " + gpa);
        System.out.println("college fee: " + collegeFee);
        System.out.println("Are you a student? " + isStudent);
        System.out.println("grade: " + grade);

    }
}
