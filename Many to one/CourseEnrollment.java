class CourseEnrollment {
    public String platformName;
    public Student student;
    public Course course;
    public Instructor instructor;

    public CourseEnrollment(String platformName, Student student, Course course, Instructor instructor) {
        this.platformName = platformName;
        this.student = student;
        this.course = course;
        this.instructor = instructor;
    }

    public void enrollmentDetails() {
        System.out.println("Platform: " + platformName);
        System.out.println("Student: " + student.name + ", Email: " + student.email);
        System.out.println("Course: " + course.courseName + ", Duration: " + course.duration + " weeks");
        System.out.println("Instructor: " + instructor.name + ", Experience: " + instructor.yearsOfExperience + " years");
    }
}


    
