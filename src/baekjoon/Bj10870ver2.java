package baekjoon;

import java.util.Scanner;

public class Bj10870ver2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] Fibonacci= new int[n+1];
		for(int i= 0; i< Fibonacci.length; i++) {
			if(n==0) Fibonacci[0]=0;
			else if(i==1) Fibonacci[1]=1;
			else Fibonacci[i]= Fibonacci[i-1]+Fibonacci[i-2];
		}
		System.out.println(Fibonacci[n]);
	}
}
