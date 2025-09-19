class Schedule {
    public String departureTime;
    public String arrivalTime;
    public Track track;

    public Schedule(String departureTime, String arrivalTime, Track track) {
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.track = track;
    }

    public void displayScheduleDetails() {
        System.out.println("Departure: " + departureTime +
                           ", Arrival: " + arrivalTime +
                           ", Track Code: " + track.trackCode +
                           ", Track Length: " + track.trackLength);
    }
}
