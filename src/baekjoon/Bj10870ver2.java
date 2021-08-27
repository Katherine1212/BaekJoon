package baekjoon;

import java.util.Scanner;

public class Bj10870ver2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int [] Fibonacci= new int[n+1];
		
		for(int i= 0; i< Fibonacci.length; i++) {
			// 0,1 은 0,1로 리턴
			if(i==0) Fibonacci[0]=0;
			else if(i==1) Fibonacci[1]=1;
			// 0,1 제외 피보나치 구하기
			else Fibonacci[i]= Fibonacci[i-1]+Fibonacci[i-2];
		}
		System.out.println(Fibonacci[n]);
	}
}
