public class Frame {
    private byte[] data;

    public Frame(byte[] d) {
        this.data = d;
    }

    public byte[] getBytes() {
        return data;
    }
}
