package eg1;

public class RegExDemo2 {

	public static void main(String[] args) {
		String mobilenum="+91-8798364872";
		if(mobilenum.matches("\\+91-[0-9]{10}")) {
			System.out.println("valid number");
		}else {
			System.out.println("invalid number");
		}

	}

}
