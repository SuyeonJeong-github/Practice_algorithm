package 자료구조;

import java.util.Scanner;
import java.util.Stack;

public class P1874_스택수열 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];
		
		for(int i=0; i<N; i++) {
			A[i] = sc.nextInt();
		}
		
		Stack<Integer> stack = new Stack<Integer>();
		StringBuffer sb = new StringBuffer();
		int num = 1;
		boolean result = true;
		
		for(int i=0; i<A.length; i++) {
			int su = A[i];
			
			if(su >= num) {
				while(su >= num) {
					stack.push(num++);
					sb.append("+\n");
				}
				
				stack.pop();
				sb.append("-\n");
			}
			else {
				int n = stack.pop();
				// 스택의 가장 위의 수가 만들어야 하는 수열의 수보다 크면 수열을 출력할 수 없음
				if(n > su) {
					System.out.println("NO");
					result = false;
					break;
				}
				else {
					sb.append("-\n");
				}
			}
		}
		
		if(result) System.out.println(sb.toString());

	}

}
