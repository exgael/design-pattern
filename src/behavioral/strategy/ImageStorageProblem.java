package behavioral.strategy;
public class ImageStorageProblem {

    // This class violates SRP. Storing, compressiong, filetering,

    private String compressor;  // enum would be better
    private String filter;

    public ImageStorageProblem(String compressor, String filter) {
        this.compressor = compressor;
        this.filter = filter;
    }

    public void store(String fileName) {
        if( compressor.equals("jpeg") ) {
            System.out.println("Compressing using JPEG");
        } else if( compressor.equals("png") ) {
            System.out.println("Compressing using PNG");
        }

        if( filter.equals("b&w") ) {
            System.out.println("Applying B&W filter");
        } else if( filter.equals("high-contrast") ) {
            System.out.println("Applying high-contrast filter");
        }
    }
}
