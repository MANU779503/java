class Speaker {
    public int[] volumes = {10, 20, 30};

    public void playVolumes() {
        System.out.println(volumes.length);
        for (int i = 0; i < volumes.length; i++) {
            System.out.println("Volume level: " + volumes[i]);
        }
    }
}
