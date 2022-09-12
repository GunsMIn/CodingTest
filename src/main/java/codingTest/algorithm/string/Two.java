package codingTest.algorithm.string;

import java.util.Scanner;

public class Two {

    public String solution(String str){
        String answer = "";

        for (char c : str.toCharArray()) {
            if(c>=65 && c<=90){
                c = Character.toLowerCase(c);
                answer += c;
            }else{
                c = Character.toUpperCase(c);
                answer +=c;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Two t = new Two();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.out.println(t.solution(str));
    }
}
