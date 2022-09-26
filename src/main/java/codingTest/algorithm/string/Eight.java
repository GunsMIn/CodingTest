package codingTest.algorithm.string;

import java.util.ArrayList;
import java.util.Scanner;

public class Eight {


    public String solution(String str) {
        String answer = "";
        for (int i = 0; i < str.length() ; i++) {
            //indexOf()는 중복된다면 처음에 나오는 index를 나타내준다
            if (str.indexOf(str.charAt(i)) == i) {
                answer += str.charAt(i);
            }
        }
        return answer;
    }





    public static void main(String[] args) {

        Eight e = new Eight();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(e.solution(str));

    }
}
