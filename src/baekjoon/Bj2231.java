package baekjoon;

import java.util.Scanner;

public class Bj2231 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int result = 0;

		for (int i = 1; i < n; i++) {
			int num = i;
			int sum = i; // 각 자릿수 합의 변수

			while (num != 0) {
				sum += num % 10; // 각 자리수 더하기
				num = num / 10;

			}
			if (sum == n) { // 각 자리수 누적 합이 같을 경우
				result = i;
				break;
			}
		}
		System.out.println(result);
	}
}
