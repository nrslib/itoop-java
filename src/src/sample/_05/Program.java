package sample._05;

public class Program {
    public static void main(String[] args) {
        var game = new JankenGame();
        game.play(1, 2, "ja", "normal");
        game.play(1, 2, "en", "reverse");
    }
}
