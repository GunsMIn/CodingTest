package codingTest.algorithm.BackJoon.stack;

import codingTest.algorithm.string.Nine;
import jdk.jshell.Snippet;

import java.util.Scanner;
import java.util.Stack;

public class One {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        Stack<Character> stack = new Stack<>();

        while (num-- > 0) {
            String value = sc.next() + " ";
            for (int i = 0; i < value.length(); i++) {
                if (value.charAt(i) == ' ') {
                    while (!stack.isEmpty()) {
                        System.out.println(stack.pop());
                    }
                }else{
                    stack.push(value.charAt(i));
                }
            }
            sc.close();
            return;


        }









        /*   int num = sc.nextInt();
        Stack<Character> stack = new Stack<>(); // stack에는 문자를 입력해줅것
        sc.nextLine();

        while(num-- > 0) {
            String input = sc.nextLine()+" ";
            for(int i = 0; i < input.length(); i++) {
                if(input.charAt(i) == ' ') { // 빈칸이있으면 빼주려고
                    while(!stack.isEmpty()) { //비어있을때까지만 빼줌
                        System.out.print(stack.pop());
                    }
                    System.out.print(" "); // 띄어쓰기
                } else
                    stack.push(input.charAt(i));
            }
            System.out.println();
        }

        sc.close();
        return;*/
    }
    }








