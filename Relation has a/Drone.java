class Drone {
    public String droneCamera;
    public Camera camera;

    public Drone(Camera camera) {
        this.droneCamera = camera.cameraResolution;
        this.camera = camera;
    }

    public void displayDrone() {
        camera.cameraDetails();
    }
}
