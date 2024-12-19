public class Student {

    static String collegeName; // static variable 

    // instance variables
    String name;
    String branch;
    int rollNumber;
    boolean isStudent;
    char grade;
    float cgpa;
    public static void main(String[] args) {

        System.out.println("*********** local variables *************");
        int m1 = 10;
        int m2 = 20;
        System.out.println(m1 + " " + m2);
        
        System.out.println("**** instance ");
        //System.out.println(name); // error
        Student stu = new Student(); // object creation
        System.out.println(stu.name);
        System.out.println(stu.branch);
        System.out.println(stu.rollNumber);
        System.out.println(stu.cgpa);
        System.out.println(stu.grade);
        System.out.println(stu.isStudent);

        System.out.println("************* static/class variables***********");
        System.out.println(Student.collegeName);


        var test = "Hello";
        System.out.println(test);
    }
}
