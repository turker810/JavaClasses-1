package com.class8;

public class Task6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int sum1=0;
int sum2=0;
	for(int i=1; i<=20; i++) {
		
		if(i%2==0) {
			
			sum1=sum1+i;
			
		}
		
		else
			sum2=sum2+i;
		
		
	}
	System.out.println("sum of even"+sum1);
	System.out.println("sum of odd"+sum2);
	
	}
	
	

}
