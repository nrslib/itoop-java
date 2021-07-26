package sample._05;

class JankenGame {
    /**
     * @param lang ja: 日本語, en: 英語
     * @param ruleName default: 通常, reverse: 逆
     */
    void play(int player, int cpu, String lang, String ruleName) {
        var rule = getRule(ruleName);
        var result = rule.judge(player, cpu);
        showResult(result, lang);
    }

    Rule getRule(String ruleName) {
        if (ruleName.equals("normal")) {
            return new NormalRule();
        } else {
            return new ReverseRule();
        }
    }

    void showResult(int result, String lang) {
        var display = getDisplay(lang);
        display.show(result);
    }

    Display getDisplay(String lang) {
        if (lang.equals("ja")) {
            return new JapaneseDisplay();
        } else {
            return new EnglishDisplay();
        }
    }
}
