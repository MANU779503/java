class Hospital {
    public String hospitalName;
    public String location;
    public Room room;

    public Hospital(String hospitalName, String location, Room room) {
        this.hospitalName = hospitalName;
        this.location = location;
        this.room = room;
    }

    public void displayHospitalDetails() {
        System.out.println("Hospital: " + hospitalName +
                           ", Location: " + location +
                           ", Room Number: " + room.roomNumber +
                           ", Room Type: " + room.roomType);
    }
	
}