package org.programming_demo.corenuts;

public class PrimeNumber {
public static boolean isPrime(int n) {
	int count=0;
	for(int i=2;i<n;i++) {
		if(n%i==0) {
			count++;
			return false;
		}
		
	}
	return true;
	
}
public static void main(String[] args) {
	for(int i=2;i<=10;i++) {
		if(isPrime(i)) {
			System.out.println(i); 
		}
	}
}
}
