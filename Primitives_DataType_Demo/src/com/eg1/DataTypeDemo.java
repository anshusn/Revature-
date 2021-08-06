package com.eg1;

public class DataTypeDemo {

	public static void main(String[] args) {
		int x=1000;
		System.out.println("x = "+x);
		
		float f=34.65576f;
		System.out.println("value of f = "+f);
		long contact=6382768L;
		System.out.println("Contact : "+contact);
		boolean b=false;
		System.out.println(b);
		int m=100;
		long r=m;
		System.out.println("r = "+r);
		float f1=m;
		double d=m;
		System.out.println("f1 : "+f1);
		System.out.println("d : "+d);
		float c1=5765.343f;
		double d2=c1;
		System.out.println("d2 : "+d2);
		int o=100;
		char u=(char)o;
		System.out.println("u : "+ u);
		double j=23.34;
		o=(int)j;
		System.out.println("o : "+ o);
		//int k=0;
		//boolean g=(boolean)k;
       // System.out.println("g : "+g);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Long.MAX_VALUE);
		System.out.println(Long.MIN_VALUE);
	}

}
