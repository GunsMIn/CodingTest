package codingTest.algorithm.string;

import java.util.Scanner;

public class Eleven {


    //리턴타입 INT
   /* public Integer solution(String str) {
        String answer = "";
        String tmp = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (Character.isDigit(c)) {
                tmp += c;
            }


        }
        answer = tmp;
        return Integer.parseInt(answer);

    }*/


    //리턴타입STRING -- >틀림
    public String solution(String str) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isDigit(c)) {
                sb.append(c); // 추가
            }
            if (str.charAt(0) == '0') {
                sb.replace(0, 1, "");
            }
        }
        answer = sb.toString();
        return answer;


    }



    public static void main(String[] args) {
        Eleven e = new Eleven();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().trim();

        System.out.println(e.solution(str));

    }
}
