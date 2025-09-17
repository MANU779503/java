class BicycleRunner {
    public static void main(String[] args) {
        Wheel wheel = new Wheel("All-Terrain");
        Bicycle bicycle = new Bicycle(wheel);

        bicycle.displayBicycle();
    }
}
