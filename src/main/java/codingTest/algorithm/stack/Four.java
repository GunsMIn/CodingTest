package codingTest.algorithm.stack;

import java.util.Scanner;
import java.util.Stack;
/*4. 후위식 연산(postfix)
설명

후위연산식이 주어지면 연산한 결과를 출력하는 프로그램을 작성하세요.
만약 3*(5+2)-9 을 후위연산식으로 표현하면 352+*9- 로 표현되며 그 결과는 12입니다.
입력
첫 줄에 후위연산식이 주어집니다. 연산식의 길이는 50을 넘지 않습니다.
식은 1~9의 숫자와 +, -, *, / 연산자로만 이루어진다.

출력
연산한 결과를 출력합니다.

예시 입력 1

352+*9-
예시 출력 1

12*/
public class Four {
    //숫자를 만났을때에는 stack에 넣어주고
    //lt 피연산자 rt연산을 해주는 숫자로 설정해주어서
    //연산자를 만나면 lt rt에 해당하는 숫자를 꺼내주어서 연산한다.
    //그리고 연산한 결과의 숫자를 다시 stack에 넣어준다.
    public int soultion(String str) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) {
                stack.push(c - 48); // 문자열 숫자를 진짜 숫자로 만들어준다
            }else{//연산자를 만났을때
                int rt = stack.pop();
                int lt = stack.pop();
                if (c == '+') {
                    stack.push(lt + rt);
                } else if (c == '-') {
                    stack.push(lt - rt);
                } else if (c == '*') {
                    stack.push(lt * rt);
                } else if (c == '/') {
                    stack.push(lt / rt);
                }
            }
        }
        answer = stack.get(0);
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Four f = new Four();
        String str = sc.next();
        System.out.println(f.soultion(str));
    }
}
