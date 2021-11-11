package base._05;

class JapaneseDisplay implements Display {
    public void show(int result) {
        if (result == 1) {
            System.out.println("勝ち");
        } else if (result == 0) {
            System.out.println("引き分け");
        } else {
            System.out.println("負け");
        }
    }
}
