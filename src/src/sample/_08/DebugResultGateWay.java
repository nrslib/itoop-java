package sample._08;

class DebugResultGateWay implements JankenResultGateWay {
    public void save(int result) {
        System.out.println("Result: " + result);
    }
}
