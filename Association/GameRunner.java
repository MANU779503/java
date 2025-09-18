class GameRunner {
    public static void main(String[] args) {
        Player player = new Player("Alex Morgan", "Forward");
        Game game = new Game("FIFA 25", "Sports", player);
        game.gameDetails();
    }
}
