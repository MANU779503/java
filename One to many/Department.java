class Department {
    public String departmentName;
    public int floor;
    public Room room;

    public Department(String departmentName, int floor, Room room) {
        this.departmentName = departmentName;
        this.floor = floor;
        this.room = room;
    }

    public void displayDepartmentDetails() {
        System.out.println("Department: " + departmentName +
                           ", Floor: " + floor +
                           ", Room Number: " + room.roomNumber +
						   ", Room Type: " + room.roomType);
    }
}
						   