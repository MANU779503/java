class Train {
    public String trainName;
    public int coachCount;
    public Track track;

    public Train(String trainName, int coachCount, Track track) {
        this.trainName = trainName;
        this.coachCount = coachCount;
        this.track = track;
    }

    public void displayTrainDetails() {
        System.out.println("Train Name: " + trainName +
                           ", Coaches: " + coachCount +
                           ", Track Code: " + track.trackCode +
                           ", Track Length: " + track.trackLength);
    }
}