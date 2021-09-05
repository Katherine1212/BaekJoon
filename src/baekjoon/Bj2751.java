package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Bj2751 {
	public static void main(String[] args) throws IOException{
		BufferedReader buffr= new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb= new StringBuilder();
		int n= Integer.parseInt(buffr.readLine());
		ArrayList<Integer> list= new ArrayList<>();
		for(int i=0; i<n; i++) {
			list.add(Integer.parseInt(buffr.readLine()));
		}
		Collections.sort(list);
		for(int val: list) {
			sb.append(val+"\n");
		}
		System.out.println(sb);
	}
}
