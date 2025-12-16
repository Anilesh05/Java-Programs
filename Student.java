public class Student
{ 
    String name;
    int htn;
    String dept;

    public Student(String name, int htn, String dept)
    {
        this.name = name;
        this.htn = htn;
        this.dept = dept;
    }

        public void display() 
    {
        System.out.println("Student Name: " + name);
        System.out.println("Hall Ticket Number: " + htn);
        System.out.println("Department: " + dept);
        System.out.println("--------------------");
    }

    public static void main(String[] args)
    {
        // Create Student objects
        Student student1 = new Student("A", 10001, "CA");
        Student student2 = new Student("B", 10002, "CSC");
        Student student3 = new Student("C", 10003, "ECE");

        // Display details for each student
        System.out.println("Displaying Student Details:");
        student1.display();
        student2.display();
        student3.display();
    }
}
