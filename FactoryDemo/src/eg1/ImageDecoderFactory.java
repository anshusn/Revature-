package eg1;

public class ImageDecoderFactory {
	
	public static ImageDecoder getInstance(String filename) {
		if(filename.endsWith(".jpg")) {
			return new JpgDecoder(filename);
		}else if(filename.endsWith(".pngDecoder")) {
			return new PngDecoder(filename);
		}
		return null;
	}

}
