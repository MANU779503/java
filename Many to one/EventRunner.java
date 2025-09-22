class EventRunner {
    public static void main(String[] args) {
        Venue venue = new Venue("Convention Hall", 500);
        Organizer organizer = new Organizer("Neeraj Kulkarni", "neeraj@events.com");
        Guest guest = new Guest("Ratan Tata", "Industrialist");
        Event event = new Event("TechCon 2025", venue, organizer, guest);

        event.eventDetails();
    }
}
