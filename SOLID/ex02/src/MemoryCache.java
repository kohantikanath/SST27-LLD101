public class MemoryCache implements Cache {
    private Frame last;

    @Override
    public void store(Frame frame) {
        last = frame;
    }

    @Override
    public Frame getLast() {
        return last;
    }
}
