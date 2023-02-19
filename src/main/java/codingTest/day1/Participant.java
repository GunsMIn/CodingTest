package codingTest.day1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Participant {

/**
 * 1. 우선 모든 참가에 +1을 해줄 것이다.
 * 2. 그리고 completion 완주한 선수들을 roof를 돌려서 -1 을 해줄 것이다.
 * **/
    public String solution(String[] participant, String[] completion) {
        String answer = "";

        Map<String, Integer> map = new HashMap<>();
        for (String person : participant) {
            map.put(person, map.getOrDefault(person, 0) + 1);
        }
        for (String person : completion) {
            map.put(person, map.get(person) - 1);
        }

        //0인 선수가 완주한 선수이다.
        for (String person : map.keySet()) {
            if (map.get(person) != 0) {
                answer = person;
            }
        }
        return answer;
    }


    /**
     * 두 번째 방법
     * 1. 우선 두 배열을 정리해주자!
     *
     * **/
    public String solution2(String[] participant, String[] completion) {
        String answer = "";
        Arrays.sort(participant);
        Arrays.sort(completion);

        for (int i = 0; i < participant.length; i++) {
            //우선 정렬을 한 상태에서 두개의 값이 같지 않는다는것은 완주하지 못한 선수라는 말이다.
            //그래서 반복을 그만두어야한다.
            if (!participant[i].equals(completion[i])) break;
            answer = participant[i];
        }

        return answer;
    }


}
