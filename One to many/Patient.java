class Patient {
    public String patientName;
    public int age;
    public Room room;

    public Patient(String patientName, int age, Room room) {
        this.patientName = patientName;
        this.age = age;
        this.room = room;
    }

    public void displayPatientDetails() {
        System.out.println("Patient: " + patientName +
                           ", Age: " + age +
                           ", Room Number: " + room.roomNumber +
                           ", Room Type: " + room.roomType);
    }
}