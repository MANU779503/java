class Light {
    public int[] brightnessLevels = {25, 50, 75, 100};

    public void showBrightness() {
        System.out.println(brightnessLevels.length);
        for (int i = 0; i < brightnessLevels.length; i++) {
            System.out.println("Brightness level: " + brightnessLevels[i] + "%");
        }
    }
}
