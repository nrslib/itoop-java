package sample._07;

class JankenGame {
    Display display;
    Rule rule;

    public JankenGame(Display display, Rule rule) {
        this.display = display;
        this.rule = rule;
    }

    void play(int player, int cpu) {
        var result = rule.judge(player, cpu);
        display.show(result);
    }
}
