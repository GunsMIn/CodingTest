package codingTest.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Kcount {

    public int[] solution(int[] array, int[][] commands) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i <commands.length; i++) {
            int start = commands[i][0];
            int end = commands[i][1];
            int k = commands[i][2];

            int[] temp = Arrays.copyOfRange(array, start - 1, end);
            Arrays.sort(temp);
            list.add(temp[k-1]);
        }
        return list.stream().mapToInt(i -> i).toArray();
    }
}
