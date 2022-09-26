package codingTest.algorithm.string;

import java.util.Scanner;

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
        int len = str.length() - 1;
        for (int i = 0; i < str.length()/2 ; i++) {
            if (str.charAt(i) != str.charAt(len - i)) {
                return "no";
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
