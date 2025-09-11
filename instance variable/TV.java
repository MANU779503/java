class TV {
    public int[] channels = {1, 2, 3, 4};

    public void showChannels() {
        System.out.println(channels.length);
        for (int i = 0; i < channels.length; i++) {
            System.out.println("This is channel " + channels[i]);
        }
    }
}
