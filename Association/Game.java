class Game {
    public String gameTitle;
    public String genre;
    public Player player;

    public Game(String gameTitle, String genre, Player player) {
        this.gameTitle = gameTitle;
        this.genre = genre;
        this.player = player;
    }

    public void gameDetails() {
        System.out.println("Game: " + gameTitle);
        System.out.println("Genre: " + genre);
        System.out.println("Main Player: " + player.name + " (" + player.position + ")");
    }
}