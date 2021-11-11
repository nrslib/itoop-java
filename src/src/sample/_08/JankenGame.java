package sample._08;

class JankenGame {
    Display display;
    Rule rule;
    JankenResultGateWay resultGateWay;

    JankenGame(Display display, Rule rule, JankenResultGateWay resultGateWay) {
        this.display = display;
        this.rule = rule;
        this.resultGateWay = resultGateWay;
    }

    void play(int player, int cpu) {
        var result = rule.judge(player, cpu);
        display.show(result);

        resultGateWay.save(result);
    }
}
