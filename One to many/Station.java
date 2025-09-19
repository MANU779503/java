class Station {
    public String stationName;
    public String city;
    public Track track;

    public Station(String stationName, String city, Track track) {
        this.stationName = stationName;
        this.city = city;
        this.track = track;
    }

    public void displayStationDetails() {
        System.out.println("Station Name: " + stationName +
                           ", City: " + city +
                           ", Track Code: " + track.trackCode +
                           ", Track Length: " + track.trackLength);
    }
}


