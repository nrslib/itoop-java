package sample._06;

public class Program {
    public static void main(String[] args) {
        var game = new JankenGame();
        game.play(0, 2, new JapaneseDisplay(), new NormalRule());
        game.play(1, 2, new JapaneseDisplay(), new NormalRule());
        game.play(2, 2, new JapaneseDisplay(), new NormalRule());
    }
}
