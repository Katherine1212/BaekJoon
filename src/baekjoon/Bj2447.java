package baekjoon;

import java.util.Scanner;

public class Bj2447 {
	static StringBuilder sb= new StringBuilder();
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int x=0; x<n; x++) {
			for(int y=0; y<n; y++) {
				print(x, y);
			}
			sb.append("\n");
		}
		System.out.println(sb.toString());
	}
	
	static void print(int x, int y) {
		while(true) {
			if(x==0) break;
			if(x%3 == 1 && y%3== 1) {
				sb.append(" ");
				return;
			}
		}
	}

}
