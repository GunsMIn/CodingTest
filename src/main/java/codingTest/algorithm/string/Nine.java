package codingTest.algorithm.string;

import java.util.Scanner;
/*앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열을 회문 문자열이라고 합니다.

문자열이 입력되면 해당 문자열이 회문 문자열이면 "YES", 회문 문자열이 아니면 “NO"를 출력하는 프로그램을 작성하세요.

단 회문을 검사할 때 대소문자를 구분하지 않습니다.


입력
첫 줄에 길이 100을 넘지 않는 공백이 없는 문자열이 주어집니다.


출력
첫 번째 줄에 회문 문자열인지의 결과를 YES 또는 NO로 출력합니다.


예시 입력 1

gooG
예시 출력 1

YES*/
public class Nine {


    public String solution(String str) {
        str = str.toUpperCase();
        String answer = "";
        int lt = 0;
        int rt = str.length()-1;
        for (int i = 0; i <str.length() ; i++) {
            if (str.charAt(lt) == str.charAt(rt)) {
                answer = "yes";
                lt++;
                rt--;
            }else{
                //같지않다면
                answer ="no";
                lt++;
                rt--;
            }
        }
        return answer;
        // 0123
        // gooG
    }

    public String solution2(String str) {
        String answer = "yes";
        str = str.toUpperCase();
        int rt = str.length() - 1;
        for (int i = 0; i < str.length()/2 ; i++) {
            if(str.charAt(i)!=str.charAt(rt-i)){
                answer = "no";
            }
        }
        return answer;
    }


    public static void main(String[] args) {

        Nine n = new Nine();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(n.solution2(str));

    }

}
