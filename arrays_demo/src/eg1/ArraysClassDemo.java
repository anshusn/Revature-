package eg1;

import java.util.Scanner;

public class ArraysClassDemo {
		
		public static void main(String ...args) {
			// TODO Auto-generated method stub
			
			System.out.println(sum());
			int ar[]= {11,2,3,4};
			System.out.println(sum(ar));
			System.out.println(sum(122,1,2,4,1));
			System.out.println(sum(66));
			demo(100,"Rk","kr","rkr");

		}
		public static int sum(int ...a) {
			if(a.length==0) {
				return 0;
			}else {
				int sum=0;
				for(int x:a) {
					sum+=x;
				}
				return sum;
			}
		}
		
	public static void demo(int x,String ...d) {
			
		}

	}
