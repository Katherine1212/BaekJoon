package baekjoon;

import java.util.Scanner;

public class Bj10872 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = Factorial(n); // 값을 중첩
		System.out.println(sum);
	}

	public static int Factorial(int n) {
		// 함수 종료
		if (n <= 1) {
			return 1;
		} else { // 재귀 진행
			return n * Factorial(n - 1); // 팩토리얼은 숫자-1씩 곱하니까 -1
		}
	}
}
