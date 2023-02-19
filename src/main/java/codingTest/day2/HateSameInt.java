package codingTest.day2;

import java.util.ArrayList;
import java.util.List;

public class HateSameInt {


    public int[] solution(int[] arr) {
        List<Integer> temp = new ArrayList<>();
        int a = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != a) {
                temp.add(arr[i]);
                a = arr[i];
            }
        }

        /*int[] answer = new int[temp.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = temp.get(i);
        }*/
        int[] answer = temp.stream().mapToInt(i -> i).toArray();
        return answer;
    }
}
