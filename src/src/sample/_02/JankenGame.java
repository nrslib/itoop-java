package sample._02;

class JankenGame {
    void play(int player, int cpu) {
        var result = judge(player, cpu);
        showResult(result);
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

    void showResult(int result) {
        if (result == 1) {
            System.out.println("勝ち");
        } else if (result == 0) {
            System.out.println("引き分け");
        } else {
            System.out.println("負け");
        }
    }
}
