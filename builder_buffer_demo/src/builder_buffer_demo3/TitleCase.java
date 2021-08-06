package builder_buffer_demo3;

public class TitleCase {

	public static void main(String[] args) {
		String s1="Hii Hello good noon and hope every thing wwill be fine";
		System.out.println(ConvertToTitleCase(s1));
		}
	public static String ConvertToTitleCase(String s) {
		StringBuilder sb=new StringBuilder();
		String ar[]=s.split(" ");
		for(int w=0;w<ar.length;w++) {
			sb.append(Character.toUpperCase(ar[w].charAt(0))).append(ar[w].substring(1)).append(" ");
		}
		return sb.toString().trim();
	}

}
