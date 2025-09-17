class PhotographerRunner {
    public static void main(String[] args) {
        Lens lens = new Lens("Macro Lens");
        Photographer photographer = new Photographer(lens);

        photographer.displayPhotographer();
    }
}
