package builder_buffer_demo2;

public class Palindrome {

	public static void main(String[] args) {
		String s="madam";
		System.out.println(IsPalindromeDetailedWay(s));
		int x=100;
		System.out.println(IsPalindromeShortHand(x+""));
		System.out.println(IsPalindromeShortHand("madame"));
		System.out.println(IsPalindromeDetailedWay("madam"));
		System.out.println(IsPalindromeShortHand(s));
		x=101;
		System.out.println(IsPalindromeShortHand(x+""));

	}
	public static boolean IsPalindromeDetailedWay(String s) {
		StringBuilder sb=new StringBuilder(s);
		sb.reverse();
		String s1=sb.toString();		
		return s.equals(s1);
	}
	
	public static boolean IsPalindromeShortHand(String s) {
		return new StringBuilder(s).reverse().toString().equals(s);
		}

}
