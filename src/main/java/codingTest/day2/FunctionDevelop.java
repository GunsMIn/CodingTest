package codingTest.day2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class FunctionDevelop {
    /**
     * Math.ceil 을 그냥 막 쓰면 정수가 나온다.
     * 때문에 아래와 같이 double로 형변환을 해야
     * 소수점이 발생하여 정상적으로 ceil 을 할 수 있다.**/

    public int[] solution(int[] progresses, int[] speeds) {

        //순서대로 되야하기 때문에 큐 구조를 사용한다.
         Queue<Integer> que = new LinkedList<>();
        // 100(진도) - 93(현재진도) = 7(남은 진도)
        // 7 / 1 (개발 속도) = 7일
        for (int i = 0; i < progresses.length; i++) {
            int developDay = (int) Math.ceil((100.0 - progresses[i]) / speeds[i]);
            que.offer(developDay);
        }
        // 7일 3일 9일
        // 2개 1개 배포
        List<Integer> answer = new ArrayList<>();
        int preDay = que.poll();
        int cnt = 1; // 기본 배포 갯수
        while (!que.isEmpty()) {
            int nextDay = que.poll();
            if (preDay >= nextDay) { // 현재 작업이 이전 작업보다 일찍 완료될 경우에는 같이 배포됩니다.
                cnt++;
            }else{ // 현재 작업이 이전 작업보다 늦게 완료될 경우에는 새로운 배포가 시작됩니다.
                answer.add(cnt);
                preDay = nextDay;
                cnt = 1;
            }
        }
        answer.add(cnt);

        int[] result = answer.stream().mapToInt(i -> i).toArray();
        return result;
    }


}
