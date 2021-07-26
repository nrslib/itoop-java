package sample._08;

public class ReverseRule implements Rule {
    @Override
    public int judge(int player, int cpu) {
        if (player == 0) {
            if (cpu == 0) {
                return 0;
            } else if (cpu == 1) {
                return -1;
            } else {
                return 1;
            }
        } else if (player == 1) {
            if (cpu == 0) {
                return 1;
            } else if (cpu == 1) {
                return 0;
            } else {
                return -1;
            }
        } else {
            if (cpu == 0) {
                return -1;
            } else if (cpu == 1) {
                return 1;
            } else {
                return 0;
            }
        }
    }
}
