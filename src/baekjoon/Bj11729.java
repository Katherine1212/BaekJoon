package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Bj11729 {
	static BufferedWriter buffw= new BufferedWriter(new OutputStreamWriter(System.out));
	
	static void HanoiTop(int n, int start, int center, int end) throws IOException{
		if(n==1) {
			buffw.write(start+" "+end+"\n");
			return;
		}
		HanoiTop(n-1, start, end, center);
		buffw.write(start+" "+end+"\n");
		HanoiTop(n-1, center, start, end);
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader buffr= new BufferedReader(new InputStreamReader(System.in));
		int n= Integer.parseInt(buffr.readLine());
		buffw.write((int)Math.pow(2, n)-1+"\n");
		HanoiTop(n, 1, 2, 3);
		buffw.flush();
		buffw.close();
		buffr.close();
	}
	
	
}
