class RiceRunner {
    public static void main(String[] args) {
        Egg egg = new Egg("Eggrice");
        Rice rice = new Rice(egg);

        rice.displayRice();
    }
}