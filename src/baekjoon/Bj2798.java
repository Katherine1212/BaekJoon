package baekjoon;

import java.util.Scanner;

public class Bj2798 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(); // 카드 덱
		int b = sc.nextInt(); // 블랙잭

		int[] arr = new int[a];// 카드덱의 수만큼의 카드 넘버를 array에 보관

		// 카드 넘버 입력
		for (int x = 0; x < a; x++) {
			arr[x] = sc.nextInt();
		}

		int result = Blackjack(arr, a, b);
		System.out.println(result);
	}

	static int Blackjack(int[] arr, int a, int b) {
		int result = 0; // 블랙잭과 가장 가까운 카드의 합
		// 주어진 숫자 중 3개의 카드 선택, 마지막 2개의 수 제외한 만큼 반복
		for (int x = 0; x < a - 2; x++) {
			// 첫번째 카드 제외한 a-1만큼 반복
			for (int y = x + 1; y < a - 1; y++) {
				// 두번째 카드 다음부터 a번까지 반복
				for (int z = y + 1; z < a; z++) {

					int total = arr[x] + arr[y] + arr[z]; // 3개 카드 합을 담음

					if (b == total) { // 3카드의 합이 블랙잭이면 반환

						return total;
					}

					if (result < total && total < b) { // 3카드의 합이 이전 합보다 크면서 블랙잭보다 작으면 갱신

						result = total;
					}
				}
			}
		}

		return result;
	}
}
