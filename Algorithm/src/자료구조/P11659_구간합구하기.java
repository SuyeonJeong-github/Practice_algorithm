package 자료구조;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P11659_구간합구하기 {

	public static void main(String[] args) throws IOException {
		
		// BufferdReader가 Scanner 보다 속도가 빠름(입력 받는 숫자 많을 때 사용)
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		
		// 받는 숫자의 길이가 길 때 StringTokenizer 사용
		StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine()); // 예제의 첫번 째 줄 받음
		
		int suNo = Integer.parseInt(stringTokenizer.nextToken());
		int quizNo = Integer.parseInt(stringTokenizer.nextToken());
		long[] S = new long[suNo + 1]; // 첫번 째 데이터를 1번 index로 설정
		
		stringTokenizer = new StringTokenizer(bufferedReader.readLine());
		
		for(int i = 1; i <= suNo; i++) { // i의 범의 주의!! 1부터 시작, suNo 이하!!
			S[i] = S[i-1] + Integer.parseInt(stringTokenizer.nextToken());
		}
		
		for(int q = 0; q < quizNo; q++) {
			stringTokenizer = new StringTokenizer(bufferedReader.readLine());
			int i = Integer.parseInt(stringTokenizer.nextToken());
			int j = Integer.parseInt(stringTokenizer.nextToken());
			System.out.println(S[j] - S[i-1]);
		}

	}

}
