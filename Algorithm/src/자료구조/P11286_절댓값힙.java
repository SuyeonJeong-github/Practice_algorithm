package 자료구조;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class P11286_절댓값힙 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		// 절댓값 기준으로 정렬(같으면 음수 우선 정렬)
		PriorityQueue<Integer> myQueue = new PriorityQueue<>((o1, o2) -> {
			int first_abs = Math.abs(o1);
			int second_abs = Math.abs(o2);
			
			if (first_abs == second_abs)
				return o1 > o2 ? 1 : -1;	// 절대값이 같으면 음수 우선 정렬하기
			else
				return first_abs - second_abs; // 절댓값을 기준으로 정렬하기
		});

		for(int i=0; i<N; i++) {
			int request = Integer.parseInt(br.readLine());
			
			if(request == 0) {
				if(myQueue.isEmpty())
					System.out.println("0");
				else
					System.out.println(myQueue.poll());
			} else {
				myQueue.add(request);
			}
		}
	}

}
