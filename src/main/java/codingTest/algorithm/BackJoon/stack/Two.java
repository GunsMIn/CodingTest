package codingTest.algorithm.BackJoon.stack;

import java.util.Scanner;
import java.util.Stack;

public class Two {






    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String str = sc.nextLine().trim();

        Stack<Character> stack = new Stack<>();

        while (num-- > 0) {
            for (char c : str.toCharArray()) {
                if (c == '(') {
                    stack.push(c);
                } else if (stack.isEmpty()) {
                    System.out.println("no");
                } else {
                    if (!stack.isEmpty()) {
                        stack.pop();
                    }
                }
            }

            if (stack.size() > 0) {
                System.out.println("no");
            }else{
                System.out.println("yes");
            }


        }
        }



}
