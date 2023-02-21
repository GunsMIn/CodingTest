package codingTest.day2;

import java.util.Stack;

public class Correct {

    boolean solution(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                stack.push(c);
            }
            else{ // ')' 일때
                if (!stack.isEmpty() && stack.peek() == '(') {
                    stack.pop();
                }else{
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
