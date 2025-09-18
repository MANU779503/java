class CarRunner {
    public static void main(String[] args) {
        Driver driver = new Driver("Lewis Hamilton", 15);
        Car car = new Car("Mercedes AMG", "Silver", driver);
        car.carDetails();
    }
}
