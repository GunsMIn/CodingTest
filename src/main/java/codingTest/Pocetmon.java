package codingTest;

import java.util.HashSet;
import java.util.Set;

public class Pocetmon {



    /**
     * 1. 최대값을 구하기 위해 nums의 length에 2를 나눈 값을 max에 대입한다.
     * 2. 중복을 제거한 값을 구하기 위해 Set을 이용해서 nums를 담아준다.
     * 3. 중복을 제거한 Set의 크기가 max보다 크면 max를, 작으면 Set 사이즈를 리턴한다.
     *
     *  이 문제는 최대 고를 수 있는 포켓몬의 경우의 수를 구해야한다.
     *  가장 많이 고를 수 있는 경우의 수는 n/2이며 만약 중복이되는 값이 있다는 로직을 통과해야한다.
     *
     * **/
    public int solution(int[] nums) {
        int answer = 0;
        int max = nums.length / 2;
        Set<Integer> set = new HashSet<>();
        for (int each : nums) {
            set.add(each);
        }

        if (set.size() < max) {
            return set.size();
        }else{
            return max;
        }
    }

    public static void main(String[] args) {

    }
}
