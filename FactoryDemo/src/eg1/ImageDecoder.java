package eg1;

public abstract class ImageDecoder {
	private String filename;

	public ImageDecoder(String filename) {
		this.filename=filename;
	}
	
	abstract void displayimage();
	

}
