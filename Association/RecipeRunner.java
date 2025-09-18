class RecipeRunner {
    public static void main(String[] args) {
        Chef chef = new Chef("Gordon Ramsay", "Italian Cuisine");
        Recipe recipe = new Recipe("Spaghetti Carbonara", 30, chef);
        recipe.recipeDetails();
    }
}
