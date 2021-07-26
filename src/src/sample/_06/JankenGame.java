package sample._06;

class JankenGame {
    void play(int player, int cpu, Display display, Rule rule) {
        var result = rule.judge(player, cpu);
        display.show(result);
    }
}
