class Fan {
    public int[] speeds = {1, 2, 3};

    public void showSpeeds() {
        System.out.println(speeds.length);
        for (int i = 0; i < speeds.length; i++) {
            System.out.println("Fan speed: " + speeds[i]);
        }
    }
}
