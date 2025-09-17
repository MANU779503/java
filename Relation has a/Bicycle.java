class Bicycle {
    public String bicycleWheel;
    public Wheel wheel;

    public Bicycle(Wheel wheel) {
        this.bicycleWheel = wheel.wheelType;
        this.wheel = wheel;
    }

    public void displayBicycle() {
        wheel.wheelDetails();
    }
}
