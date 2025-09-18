class Car {
    public String model;
    public String color;
    public Driver driver;

    public Car(String model, String color, Driver driver) {
        this.model = model;
        this.color = color;
        this.driver = driver;
    }

    public void carDetails() {
        System.out.println("Car Model: " + model);
        System.out.println("Color: " + color);
        System.out.println("Driven by: " + driver.name + " (" + driver.yearsOfExperience + " years experience)");
    }
}