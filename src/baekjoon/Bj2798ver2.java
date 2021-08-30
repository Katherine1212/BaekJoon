package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Bj2798ver2 {

	public static void main(String[] args) throws IOException{
		BufferedReader buffr= new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st= new StringTokenizer(buffr.readLine(), " ");
		
		int a= Integer.parseInt(st.nextToken());
		int b= Integer.parseInt(st.nextToken());
		
		int[] arr= new int[a];
		
		st= new StringTokenizer(buffr.readLine(), " ");
		for(int x=0; x<a; x++) {
			arr[x]= Integer.parseInt(st.nextToken());
		}
		int result= Blackjack(arr, a, b);
		System.out.println(result);
	}
	
	static int Blackjack(int[] arr, int a, int b) {
		int result= 0;
		for(int x= 0; x<a-2; x++) {
			if(arr[x] > b) continue;
			
			for(int y=x+1; y<a-1; y++) {
				if(arr[x]+arr[y] > b) continue;
				
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
