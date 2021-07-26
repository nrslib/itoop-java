package sample._08;

class DebugResultGateWay implements JankenResultGateWay {
    @Override
    public void save(int result) {
        System.out.println("Result: " + result);
    }
}
