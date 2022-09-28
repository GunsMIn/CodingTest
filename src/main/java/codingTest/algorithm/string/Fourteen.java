package codingTest.algorithm.string;

import java.util.Scanner;

public class Fourteen {

    public String solution(int n,String str) {
        String answer = "";
        for (int i = 0; i < str.length(); i++) {
            String tmp = str.substring(0, 7).replace('#', '1')
                    .replace('*', '0');
            int num = Integer.parseInt(tmp, 2);
            System.out.println(tmp+" " + num);
            str = str.substring(7);

            answer += (char)num;

        }

        return answer;
    }

    public static void main(String[] args) {

        Fourteen T = new Fourteen();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        String str = kb.next();

        System.out.println(T.solution(n,str));
    }
}
