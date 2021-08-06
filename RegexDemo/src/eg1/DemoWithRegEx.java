package eg1;

public class DemoWithRegEx {

	public static void main(String[] args) {
		System.out.println(IsValidPan("IRUPS1969H"));
		System.out.println(IsValidPan(null));
      
	}
	public static boolean IsValidPan(String pan) {
		return pan!=null && pan.matches("[A-Z]{5}[0-9]{4}[A-Z]{1}");
		
	}

}
