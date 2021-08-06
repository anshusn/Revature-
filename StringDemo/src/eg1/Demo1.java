package eg1;

public class Demo1 {

	public static void main(String[] args) {
		String s1="Hello";
		String s2="Hello";
		String s3=new String("Hello");
		System.out.println("the value of s1 "+s1+" memory of s1 "+System.identityHashCode(s1));
		System.out.println("the value of s2 "+s2+" memory of s2 "+System.identityHashCode(s2));
		System.out.println("the value of s3 "+s3+" memory of s3 "+System.identityHashCode(s3));
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s1.equals(s2));
		System.out.println(s2.equals(s3));
		System.out.println(s1.contains("ell"));
		System.out.println(s1.replace("e","w"));
		System.out.println(s1.replace('H','o'));
		System.out.println(s1);
		System.out.println("s1.equals(\"Hello\") "+s1.equals("Hello"));
		System.out.println("s3.equalsIgnoreCase(\"HelLo\") "+s3.equalsIgnoreCase("HelLo"));
		System.out.println("s1.length() "+s1.length());
		System.out.println(s1.charAt(2));
		System.out.println(s1.substring(2,4));
		System.out.println(s1.substring(1));
		System.out.println(s3.intern());
		s3=s3.intern();
		System.out.println(s3==s1);
		char[] c1=s1.toCharArray();
		System.out.println(c1.toString());
		String s="hii hey i know that you know java but please be patient";
		String ar[]=s.split(" ");
		for(int i=0;i<ar.length;i++) {
		System.out.println(ar[i].toUpperCase());
		}
		String s4="     Hey I am message        ";
		System.out.println(s4);
		s4=s4.trim();
		System.out.println(s4);
		System.out.println(s1.startsWith("He"));
		System.out.println(s1.endsWith("lo"));
		System.out.println(s1.indexOf("o"));
		System.out.println(s1.lastIndexOf("l"));	
	}
}
