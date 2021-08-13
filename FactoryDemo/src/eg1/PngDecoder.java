package eg1;

public class PngDecoder extends ImageDecoder {

	public PngDecoder(String filename) {
		super(filename);
	}

	@Override
	void displayimage() {
		System.out.println("Display .png Image");
	}
	
	

}
