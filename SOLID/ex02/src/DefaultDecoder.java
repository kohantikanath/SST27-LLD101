public class DefaultDecoder implements Decoder {
    @Override
    public Frame decode(byte[] fileBytes) {
        return new Frame(fileBytes); // pretend decoding
    }
}
