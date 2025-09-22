class CourseRunner {
    public static void main(String[] args) {
        Student student = new Student("Thejas", "theja@example.com");
        Course course = new Course("Data Structures", 6);
        Instructor instructor = new Instructor("Dr.Prakash", 12);
        CourseEnrollment enrollment = new CourseEnrollment("Coursera", student, course, instructor);

        enrollment.enrollmentDetails();
    }
}
