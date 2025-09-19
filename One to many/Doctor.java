
class Doctor {
    public String doctorName;
    public String specialization;
    public Room room;

    public Doctor(String doctorName, String specialization, Room room) {
        this.doctorName = doctorName;
        this.specialization = specialization;
        this.room = room;
    }

    public void displayDoctorDetails() {
        System.out.println("Doctor: " + doctorName +
                           ", Specialization: " + specialization +
                           ", Room Number: " + room.roomNumber +
                           ", Room Type: " + room.roomType);
    }
}