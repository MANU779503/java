class Ticket {
    public String passengerName;
    public double price;
    public Track track;

    public Ticket(String passengerName, double price, Track track) {
        this.passengerName = passengerName;
        this.price = price;
        this.track = track;
    }

    public void displayTicketDetails() {
        System.out.println("Passenger: " + passengerName +
                           ", Price: " + price +
                           ", Track Code: " + track.trackCode +
                           ", Track Length: " + track.trackLength);
    }
}
