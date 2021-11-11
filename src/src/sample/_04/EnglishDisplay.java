package sample._04;

class EnglishDisplay {
    void show(int result) {
        if (result == 1) {
            System.out.println("win");
        } else if (result == 0) {
            System.out.println("draw");
        } else {
            System.out.println("lose");
        }
    }
}
