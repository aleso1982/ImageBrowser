package imagebrowser;

public class ProxyImage extends Image {
    
    private final ImageLoader loader;
    private Image realImage;

    public ProxyImage(ImageLoader loader) {
        this.loader = loader;
    }

    @Override
    public Bitmap getBitmap() {
        checkIamgeLoader();
        return realImage.getBitmap();
    }

    private void checkIamgeLoader() {
        if (realImage != null) return;
        realImage = loader.load();
    }

}
