class Watch {
    public int[] alarms = {7, 12, 18};

    public void showAlarms() {
        System.out.println(alarms.length);
        for (int i = 0; i < alarms.length; i++) {
            System.out.println("Alarm set at: " + alarms[i] + ":00");
        }
    }
}
