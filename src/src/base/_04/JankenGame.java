package base._04;

class JankenGame {
    /**
     * @param lang ja: 日本語, en: 英語
     */
    void play(int player, int cpu, String lang) {
        var result = judge(player, cpu);
        showResult(result, lang);
    }

    int judge(int player, int cpu) {
        if (player == 0) {
            if (cpu == 0) {
                return 0;
            } else if (cpu == 1) {
                return 1;
            } else {
                return -1;
            }
        } else if (player == 1) {
            if (cpu == 0) {
                return -1;
            } else if (cpu == 1) {
                return 0;
            } else {
                return 1;
            }
        } else {
            if (cpu == 0) {
                return 1;
            } else if (cpu == 1) {
                return -1;
            } else {
                return 0;
            }
        }
    }

    void showResult(int result, String lang) {
        if (lang.equals("ja")) {
            // JapaneseDisplayを使おう
        } else {
            // EnglishDisplayを使おう
        }
    }
}
