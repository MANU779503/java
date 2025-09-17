class Rice {
    public String riceWithEgg;
    public Egg egg;

    public Rice(Egg egg) {
        this.riceWithEgg = egg.eggType;
        this.egg = egg;
    }

    public void displayRice() {
        egg.eggDetails();
    }
}