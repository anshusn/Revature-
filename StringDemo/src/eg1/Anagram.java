package eg1;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		System.out.println(IsAnagram("School master", "The classroom"));
		System.out.println(IsAnagram("Dormitory", "dirty room"));
	}
	
	public static boolean IsAnagram(String s1,String s2) {
		boolean b=false;
		char[] c1=s1.replaceAll(" ","").toLowerCase().toCharArray();
		char[] c2=s2.replaceAll(" ","").toLowerCase().toCharArray();
		
		if(c1.length==c2.length) {
			Arrays.sort(c1);
			Arrays.sort(c2);
			if(Arrays.equals(c1, c2)){
				b=true;
			}else {
				b=false;
			}
		}
			return b;
		}
	}
