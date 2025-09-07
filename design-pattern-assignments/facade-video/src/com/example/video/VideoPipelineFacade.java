package com.example.video;
import java.nio.file.Path;

public class VideoPipelineFacade {
    private final Decoder decoder;
    private final FilterEngine filterEngine;
    private final Encoder encoder;
    public VideoPipelineFacade(Decoder decoder, FilterEngine filterEngine, Encoder encoder) {
        this.decoder = decoder;
        this.filterEngine = filterEngine;
        this.encoder = encoder;
    }
    public Path process(Path src, Path out, double scaleFactor) {
        Frame[] frames = decoder.decode(src);
        frames = filterEngine.grayscale(frames);
        frames = filterEngine.scale(frames, scaleFactor);
        return encoder.encode(frames, out);
    }
    
}
