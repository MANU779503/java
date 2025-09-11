public class CarEngine {
    public int cylinders = 6;
    public String engineName = "V6 Turbo";
    public boolean isRunning = true;
    public char fuelType = 'D';  // ‘D’ for Diesel, ‘P’ for Petrol, ‘E’ for Electric
    public long displacement = 3500L; // in cc
    public float horsepower = 400.5f;
    public double torque = 500.0;

    public int getCylinders() {
        System.out.println("Cylinders = " + cylinders);
        return cylinders;
    }
    public String getEngineName() {
        System.out.println("Engine name = " + engineName);
        return engineName;
    }
    public boolean getIsRunning() {
        System.out.println("Is engine running = " + isRunning);
        return isRunning;
    }
    public char getFuelType() {
        System.out.println("Fuel type = " + fuelType);
        return fuelType;
    }
    public long getDisplacement() {
        System.out.println("Displacement = " + displacement);
        return displacement;
    }
    public float getHorsepower() {
        System.out.println("Horsepower = " + horsepower);
        return horsepower;
    }
    public double getTorque() {
        System.out.println("Torque = " + torque);
        return torque;
    }
}
