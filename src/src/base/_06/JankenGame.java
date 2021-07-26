package base._06;

import sample._05.NormalRule;
import sample._05.ReverseRule;
import sample._05.Rule;

class JankenGame {
    // Rule を引数で受け取るように書き換えよう
    void play(int player, int cpu, Display display, String ruleName) {
        var rule = getRule(ruleName);
        var result = rule.judge(player, cpu);
        display.show(result);
    }

    Rule getRule(String ruleName) {
        if (ruleName.equals("normal")) {
            return new NormalRule();
        } else {
            return new ReverseRule();
        }
    }
}
