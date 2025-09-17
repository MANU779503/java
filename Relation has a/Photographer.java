class Photographer {
    public String photographerLens;
    public Lens lens;

    public Photographer(Lens lens) {
        this.photographerLens = lens.lensType;
        this.lens = lens;
    }

    public void displayPhotographer() {
        lens.lensDetails();
    }
}
