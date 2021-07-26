package sample._06;

public class EnglishDisplay implements Display {
    public void show(int result) {
        if (result == 1) {
            System.out.println("win");
        } else if (result == 0) {
            System.out.println("draw");
        } else {
            System.out.println("lose");
        }
    }
}
