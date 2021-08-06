package builder_buffer_demo1;

public class Demo1 {

	public static void main(String[] args) {
		StringBuffer sb1=new StringBuffer("Hello");
		System.out.println("content of sb1 "+sb1+". memory of sb1 is "+System.identityHashCode(sb1));
		sb1.append("hey").append(6465).append(623.67).append(true);
		System.out.println("content of sb1 "+sb1+". memory of sb1 is "+System.identityHashCode(sb1));
		sb1.delete(0, 2);
		System.out.println(sb1);
		sb1.reverse();
		System.out.println(sb1);
		sb1.deleteCharAt(1);
		System.out.println(sb1);
		sb1.insert(1, "I am a new word here");
		System.out.println(sb1);
		System.out.println(sb1.length());
		StringBuffer sb2=new StringBuffer("hello");
		StringBuffer sb3=new StringBuffer("hello");
		System.out.println(sb2.equals(sb3));
		if(sb2.toString().equals(sb3.toString())) {
			System.out.println("both are equal");
		}else {
			System.out.println("both are not equal");
		}
		System.out.println("hello".equals("hello"));
	}

}
