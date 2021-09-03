package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Bj1436 {
	public static void main(String[] args) throws NumberFormatException, IOException{
		BufferedReader buffr= new BufferedReader(new InputStreamReader(System.in));
		int value= Integer.valueOf(buffr.readLine());
		int ans= 666;
		int cnt= 0;
		
		while(true) {
			if(String.valueOf(ans).indexOf("666")>=0) {
				cnt++;
			}
			if(cnt==value) {
				System.out.println(ans);break;
			}
			ans++;
		}
	}
	
}
