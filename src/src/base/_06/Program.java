package base._06;

public class Program {
    public static void main(String[] args) {
        var game = new JankenGame();
        game.play(1, 2, new JapaneseDisplay(), "normal");
        game.play(2, 2, new JapaneseDisplay(), "normal");
        game.play(3, 2, new JapaneseDisplay(), "normal");
    }
}