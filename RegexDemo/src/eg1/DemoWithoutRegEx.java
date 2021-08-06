package eg1;

public class DemoWithoutRegEx {

	public static void main(String[] args) {
		System.out.println(IsValidPan("IRUPS1969H"));
		System.out.println(IsValidPan("hguyG5678H"));

	}
	public static boolean IsValidPan(String s) {
		boolean b=false;
		if(s.length()==10 && Character.isUpperCase(s.charAt(9))) {
			int upper=0;
			for(int i=0;i<5;i++) {
				if(Character.isUpperCase(s.charAt(i))) {
					upper++;
				}
			}if(upper==5) {
				int digit=0;
				for(int i=5;i<9;i++) {
					if(Character.isDigit(s.charAt(i))) {
						digit++;
					}
				}if(digit==4) {
					b=true;
				}
			}
			
			
			
			
		}
		return b;
}
}