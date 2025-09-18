class Recipe {
    public String dishName;
    public int prepTime;
    public Chef chef;

    public Recipe(String dishName, int prepTime, Chef chef) {
        this.dishName = dishName;
        this.prepTime = prepTime;
        this.chef = chef;
    }

    public void recipeDetails() {
        System.out.println("Dish: " + dishName);
        System.out.println("Preparation Time: " + prepTime + " minutes");
        System.out.println("Chef: " + chef.name + " (Specialty: " + chef.specialty + ")");
    }
}