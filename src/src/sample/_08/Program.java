package sample._08;

public class Program {
    public static void main(String[] args) {
        var display = new JapaneseDisplay();
        var rule = new NormalRule();
        var resultGateWay = new DebugResultGateWay();
        var game = new JankenGame(display, rule, resultGateWay);
        game.play(1, 2);
        game.play(2, 2);
        game.play(3, 2);
    }
}
