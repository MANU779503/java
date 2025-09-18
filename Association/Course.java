class Course {
    public String courseName;
    public int duration;
    public Teacher teacher;

    public Course(String courseName, int duration, Teacher teacher) {
        this.courseName = courseName;
        this.duration = duration;
        this.teacher = teacher;
    }

    public void courseDetails() {
        System.out.println("Course: " + courseName);
        System.out.println("Duration: " + duration + " hours");
        System.out.println("Instructor: " + teacher.name + " (" + teacher.experience + " years experience)");
    }
}