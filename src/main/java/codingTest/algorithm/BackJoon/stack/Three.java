package codingTest.algorithm.BackJoon.stack;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

/*괄호가 입력되면 올바른 괄호이면 “YES", 올바르지 않으면 ”NO"를 출력합니다.
(())() 이것은 괄호의 쌍이 올바르게 위치하는 거지만, (()()))은 올바른 괄호가 아니다.

입력
첫 번째 줄에 괄호 문자열이 입력됩니다. 문자열의 최대 길이는 30이다.

출력
첫 번째 줄에 YES, NO를 출력한다.


예시 입력 1
(()(()))(()
예시 출력 1
NO*/
public class Three {
    public String solution(String str) {
        String answer = "YES";
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == '(') {
                stack.push(c);
            } else{
                if (stack.isEmpty()) { // ')' 가 더 많은 경우
                    answer = "NO";
                }
                stack.pop();
            }
        }
        if (!stack.isEmpty()) { // '('가 더 많은 경우
            answer = "NO";
        }
        return answer;
    }

    public static void main(String[] args) {
        Three t = new Three();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println( t.solution(str));
    }
}
