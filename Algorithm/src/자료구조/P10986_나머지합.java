package 자료구조;

import java.io.IOException;
import java.util.Scanner;

public class P10986_나머지합 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		long[] S = new long[N]; // 합 배열
		long[] C = new long[M]; // 같은 나머지의 인덱스를 카운트하는 배열
		long answer = 0; // 정답 변수
		
		S[0] = sc.nextInt();

		// 합 배열 저장
		// 합 배열 공식 : S[i] = S[i-1] + A[i]
		for(int i = 1; i < N; i++) {
			S[i] = S[i-1] + sc.nextInt();
		}
		
		// 합 배열을 M으로 나눈 나머지 값
		for(int i = 0; i < N; i++) {
			int remainder = (int)(S[i] % M);
			
			if(remainder == 0) answer++;
			C[remainder] ++;
		}
		
		for(int i = 0; i < M; i++) {
			if(C[i] > 1) {
				// 나머지가 같은 인덱스 중 2개를 뽑는 경우의 수 더하기
				// C[i]개 중 2개를 뽑는 경우의 수 계산 공식 : C[i] * (C[i] - 1) / 2
				answer = answer + (C[i] * (C[i] - 1) / 2);
			}
		}
		
		System.out.println(answer);
	}

}
