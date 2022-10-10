package codingTest.algorithm.stack;

import java.util.Scanner;
import java.util.Stack;

public class One {

    //올바른 괄호
    public String solution(String str) {
        String answer = "YES";
        Stack<Character> stack = new Stack<>();
        for (char c : str.toCharArray()) {
            if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                if (stack.isEmpty()) { // ')'를 만나서 빼려고하는데 ')'개수가 많아서 isEmpty가 뜨면!
                    answer = "NO";
                }
                stack.pop();
            }
        }
        if (!stack.isEmpty()) {
            answer = "NO";
        }
        return answer;
    }


    public static void main(String[] args) {

        One o = new One();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(o.solution(str));


    }
}
