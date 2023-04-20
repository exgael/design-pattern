package behavioral.strategy.implementation.compressors;

import behavioral.strategy.implementation.Compressor;

public class PngCompressor implements Compressor
{
    @Override
    public void compress(String fileName)
    {
        System.out.println("Compressing using PNG");
    }
}
    

