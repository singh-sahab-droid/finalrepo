public class StudentGreeting {
    public static void main(String[] args) {
        System.out.println("Hello, Students!");

        String[] students = {"Alice", "Bob", "Charlie", "David", "Eva"};

        System.out.println("Here are the student names:");
        for (String student : students) {
            System.out.println(student);
        }
    }
}
