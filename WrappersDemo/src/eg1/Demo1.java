package eg1;

public class Demo1 {

	public static void main(String[] args) {
		Integer i1=100;
		Integer i2=100;
		Integer i3=new Integer(100);
		System.out.println("value of i1 "+i1+" memory of i1 "+System.identityHashCode(i1));
		System.out.println("value of i2 "+i2+" memory of i2 "+System.identityHashCode(i2));
		System.out.println("value of i3 "+i3+" memory of i3 "+System.identityHashCode(i3));
		System.out.println(i1==i3);
		System.out.println(i1==i2);
		int m=200;
		i1=m;
		System.out.println(m);
		System.out.println(i1);
	
		i1=200000;
		m=i1;
		System.out.println(m);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		String s="10900";
		Integer c=Integer.parseInt(s);
		System.out.println("c "+c);
		int j=800;
		String s1=j+"";
		System.out.println(s1);
		System.out.println(Integer.toBinaryString(10));
		System.out.println(Integer.toHexString(20));
		System.out.println(Integer.toOctalString(10));
		
		Integer m1=100;
		System.out.println("m1 = "+m1);
		System.out.println("m1.comareto(100) "+m1.compareTo(100));
		System.out.println("m1.comareto(102) "+m1.compareTo(102));
		System.out.println("m1.comareto(99) "+m1.compareTo(99));
		
		Float f=m1.floatValue();
		System.out.println(f);
		
		Float f1=1000.875598f;
		Integer i8=f1.intValue();
		System.out.println(i8);
		
		Long l=65l;
		m1=l.intValue();
		System.out.println(m1);
		
		Double d=75.8785687d;
		m1=d.intValue();
		System.out.println(m1);
	
	}

}
