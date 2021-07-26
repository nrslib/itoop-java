package base._07;

// コンストラクタを定義して、DisplayとRuleを受け取ってフィールドに格納しよう
class JankenGame {
    void play(int player, int cpu, Display display, Rule rule) {
        var result = rule.judge(player, cpu);
        display.show(result);
    }
}
