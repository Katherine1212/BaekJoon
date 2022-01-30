package baekjoon;

import java.util.Scanner;

public class Bj1018 {
	Scanner sc= new Scanner(System.in);
	int n= sc.nextInt();
	int m= sc.nextInt();
	boolean[][] arr= new boolean[n][m];
	
	for(int i=0; i<n; i++) {
		String chess= sc.next();
		for(int j= 0; j<m; j++) 
			if(chess.charAt(j)=="B") chess[i][j]= true;	
	}
	boolean[] white= new boolean[8];
	boolean[] black= new boolean[8];
	
	for(int i=0; i<8; i=i+2) {
		white[i]= true;
	}
	for(int i=1; i<8; i=i+2) {
		white[i]= true;
	}
	int cnt= 0;
	int result= 65;
	for(int i=0; i<= n-8; i++) {
		for(int j=0; j<= m-8; j++) {
			cnt= 0;
			for(int l=i; l<i+8; l++) {
				if((l-i)%2==0) {
					for(int k=0; k<8; k++) {
						
					}
				}
			}
		}
	}
	
	
}
