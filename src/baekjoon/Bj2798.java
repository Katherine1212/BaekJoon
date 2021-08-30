package baekjoon;

import java.util.Scanner;

public class Bj2798 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int a= sc.nextInt();
		int b= sc.nextInt();
		
		int[] arr= new int[a];
		
		for(int x=0; x<a; x++) {
			arr[x]= sc.nextInt();
		}
		
		int result= Blackjack(arr, a, b);
		System.out.println(result);
	}
	
	static int Blackjack(int[] arr, int a, int b) {
		int result= 0;
		
		for(int x= 0; x<a-2; x++) {
			
			for(int y=x+1; y<a-1; y++) {
				
				for(int z=y+1; z<a; z++) {
					
					int total= arr[x]+arr[y]+arr[z];
					
					if(b== total) {
						
						return total;
					}
					
					if(result<total && total<b) {
						
						result= total;
					}
				}
			}
		}
		
		return result;
	}
}
