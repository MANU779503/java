class DroneRunner {
    public static void main(String[] args) {
        Camera camera = new Camera("4K UHD");
        Drone drone = new Drone(camera);

        drone.displayDrone();
    }
}
