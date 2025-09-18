class CourseRunner {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Dr. Smith", 12);
        Course course = new Course("Java Programming", 40, teacher);
        course.courseDetails();
    }
}
