 class TrainRunner {
    public static void main(String[] args) {
        Track track = new Track("TRK101", 500);
        
        Train train = new Train("Express", 12, track);
        Station station = new Station("Central", "New York", track);
        Schedule schedule = new Schedule("10:00 AM", "04:00 PM", track);
        Ticket ticket = new Ticket("Alice", 120.50, track);

        train.displayTrainDetails();
        station.displayStationDetails();
        schedule.displayScheduleDetails();
        ticket.displayTicketDetails();
    }
}