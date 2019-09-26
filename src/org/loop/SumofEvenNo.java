package org.loop;

public class SumofEvenNo {
public static void main(String[] args) {
	int i=0;
	for(int j=1;j<=100;j++)
	{
	if(j%2==0)
		{
			i=i+j;
		}	
	}
	System.out.println(i);
}
}
