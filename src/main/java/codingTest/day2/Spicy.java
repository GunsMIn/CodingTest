package codingTest.day2;

import java.util.PriorityQueue;

public class Spicy {

    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < scoville.length; i++) {
            pq.offer(scoville[i]);
        }

        //가장 매운 음식의 스코빌 지수가 K 이상이 될 때까지 반복합니다.
        while (pq.peek() < K) {
            if (pq.size() < 2) {
                return -1;
            }
            int a = pq.poll();
            int b = pq.poll();
            int scovilleLow = a + (b * 2);
            pq.offer(scovilleLow);
            answer++;
        }
        return answer;
    }
}
