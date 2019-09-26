package org.loop;

public class SumofOddNo {
	public static void main(String[] args) {
		int a=0;
		for(int b=0; b<=100; b++){
			if(b%2==1)             //for some of even give ==0
			{
				a=a+b;
			}
		}
		System.out.println(a);
	}
	}		