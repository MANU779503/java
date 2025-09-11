class Computer {
    public int[] coreUsage = {30, 50, 70};

    public void showUsage() {
        System.out.println(coreUsage.length);
        for (int i = 0; i < coreUsage.length; i++) {
            System.out.println("Core " + (i+1) + " usage: " + coreUsage[i] + "%");
        }
    }
}
