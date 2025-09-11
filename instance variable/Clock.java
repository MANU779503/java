class Clock {
    public int[] times = {12, 3, 6, 9};

    public void showTimes() {
        System.out.println(times.length);
        for (int i = 0; i < times.length; i++) {
            System.out.println("Clock shows: " + times[i] + " o'clock");
        }
    }
}
