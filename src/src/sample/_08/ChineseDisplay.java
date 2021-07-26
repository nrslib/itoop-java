package sample._08;

public class ChineseDisplay implements Display {
    public void show(int result) {
        if (result == 1) {
            System.out.println("你赢了");
        } else if (result == 0) {
            System.out.println("平局");
        } else {
            System.out.println("你失败了");
        }
    }
}
