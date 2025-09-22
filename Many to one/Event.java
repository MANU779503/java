class Event {
    public String eventName;
    public Venue venue;
    public Organizer organizer;
    public Guest guest;

    public Event(String eventName, Venue venue, Organizer organizer, Guest guest) {
        this.eventName = eventName;
        this.venue = venue;
        this.organizer = organizer;
        this.guest = guest;
    }

    public void eventDetails() {
        System.out.println("Event: " + eventName);
        System.out.println("Venue: " + venue.name + ", Capacity: " + venue.capacity);
        System.out.println("Organizer: " + organizer.name + ", Email: " + organizer.email);
        System.out.println("Guest: " + guest.name + ", Occupation: " + guest.occupation);
    }
}

