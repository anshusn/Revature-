package eg1;

public class JpgDecoder extends ImageDecoder{

	public JpgDecoder(String filename) {
		super(filename);
	}

	@Override
	void displayimage() {
		System.out.println("Display .jpg image");
	}
	

}
