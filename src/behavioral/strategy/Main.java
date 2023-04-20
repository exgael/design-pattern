package behavioral.strategy;

import behavioral.strategy.implementation.ImageStorage;
import behavioral.strategy.implementation.compressors.JpegCompressor;
import behavioral.strategy.implementation.compressors.PngCompressor;
import behavioral.strategy.implementation.filters.BlackAndWhiteFilter;

public class Main {
    public static void main(String[] args) {
        var imageStorage = new ImageStorage();
        
        imageStorage.store(
            "image.jpg", 
            new JpegCompressor(),
            new BlackAndWhiteFilter()
        );

        imageStorage.store(
            "image.jpg", 
            new PngCompressor(),
            new BlackAndWhiteFilter()
        );
    }   
}
