class Appointment {
    public String date;
    public String time;
    public Room room;

    public Appointment(String date, String time, Room room) {
        this.date = date;
        this.time = time;
        this.room = room;
    }

    public void displayAppointmentDetails() {
        System.out.println("Appointment Date: " + date +
                           ", Time: " + time +
                           ", Room Number: " + room.roomNumber +
                           ", Room Type: " + room.roomType);
    }
}
