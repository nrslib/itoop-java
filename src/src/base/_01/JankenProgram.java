package base._01;

public class JankenProgram {
    public void play(int player, int cpu) {
        var result = judge(player, cpu);
        showResult(result);
    }

    int judge(int player, int cpu) {
        // 勝敗を判定して結果（1:勝ち, 2:引き分け, 3:負け）を返却しよう
        return 0;
    }

    void showResult(int result) {
        // 結果をもとに勝敗を System.out.println を使って表示しよう
        System.out.println("結果を表示");
    }
}
