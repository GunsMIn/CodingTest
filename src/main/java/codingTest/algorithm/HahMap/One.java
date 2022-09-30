package codingTest.algorithm.HahMap;
/*
* 설명

학급 회장을 뽑는데 후보로 기호 A, B, C, D, E 후보가 등록을 했습니다.

투표용지에는 반 학생들이 자기가 선택한 후보의 기호(알파벳)가 쓰여져 있으며 선생님은 그 기호를 발표하고 있습니다.

선생님의 발표가 끝난 후 어떤 기호의 후보가 학급 회장이 되었는지 출력하는 프로그램을 작성하세요.

반드시 한 명의 학급회장이 선출되도록 투표결과가 나왔다고 가정합니다.


입력
첫 줄에는 반 학생수 N(5<=N<=50)이 주어집니다.

두 번째 줄에 N개의 투표용지에 쓰여져 있던 각 후보의 기호가 선생님이 발표한 순서대로 문자열로 입력됩니다.


출력
학급 회장으로 선택된 기호를 출력합니다.


예시 입력 1

15
BACBACCACCBDEDE
예시 출력 1

C*/
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class One {


    public char solution(int n,String str) {
        char answer = ' ';
        int max = Integer.MIN_VALUE;
        Map<Character, Integer> map = new HashMap<>();

        for (char c : str.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1); //map의 key에 따른 카운팅
        }

        for (Character x : map.keySet()) {
            if (map.get(x) > max) {
                max = map.get(x);
                answer = x;
            }
        }

        return answer;
    }


    public static void main(String[] args) {

        One o = new One();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        System.out.println( o.solution(n,str));

    }
}
