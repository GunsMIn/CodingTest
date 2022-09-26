package codingTest.algorithm.string;

import org.apache.catalina.manager.ManagerServlet;

import java.util.Scanner;
       /* 한 개의 문자열을 입력받고,특정문자를 입력받아 해당 특정문자가 입력받은 문자열에 몇 개
        존재하는지 알아내는 프로그램을 작성하세요.
        대소문자를 구분하지 않습니다.문자열의 길이는 100을 넘지 않습니다.
        입력
        첫 줄에 문자열이 주어지고, 두 번째 줄에 문자가 주어진다.
        문자열은 영어 알파벳으로만 구성되어 있습니다.
        출력
        첫 줄에 해당 문자의 개수를 출력한다.


        예시 입력 1

        Computercooler
        c
        예시 출력 1

        2*/
public class One {

    public int solution(String str,char t){
        int answer =0;
        //대소문자를 구분하지 않아서
        str = str.toUpperCase();
        t = Character.toUpperCase(t); // 문자는 Character라는 클래스로 이용해주어야한다.

        //빠른 for문 ->배열 아니면 collectionframeWork가 와야지 String 은안된다
        //그래서 .toCharArray()을 해주어서 문자열을 문자 배열로 만들어준다
        for (char x : str.toCharArray()) {
            if(x==t){
                answer++;
            }
        }


        return answer;

    }

    public static void main(String[] args) {
        One o = new One();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char c = sc.next().charAt(0);
        System.out.println(o.solution(str,c));
    }

}
