package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Bj2750 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		int[] numArray= new int[n];
		for(int i=0; i<numArray.length; i++) {
			numArray[i]= sc.nextInt();
		}
		Arrays.sort(numArray);
		for(int num: numArray) {
			System.out.println(num);
		}
	}
}
