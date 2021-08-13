package eg1;

public class Main {

	public static void main(String[] args) {
		
		
		ImageDecoder jpgDecoder = ImageDecoderFactory.getInstance("logo.jpg");
		jpgDecoder.displayimage();
		
		JpgDecoder pngdecoder=new JpgDecoder("hello.png");

	}

}
