package codingTest.algorithm.string;

import java.util.ArrayList;
import java.util.Scanner;

public class Six {

   /* //풀이방법1
    public ArrayList<String> solution(int count, String[] str) {
        ArrayList<String> answer = new ArrayList<>();
        for (String s : str) {
            String tmp = new StringBuilder(s).reverse().toString();
            answer.add(tmp);
        }
        return answer;
    }*/


    //풀이방법2
    public ArrayList<String> solution3(int count,String[] str){
        ArrayList<String> answer = new ArrayList<>();

        for (String s : str) {
            char[] c = s.toCharArray(); // 여기서 문자 배열이됨
            int lt = 0;//끝과 끝을 바꾸어주려고
            int rt = s.length()-1;
            //하나의 문자배열 반복들어감
            while (lt < rt) {
                char tmp = c[lt];
                c[lt] = c[rt]; // 바뀜
                c[rt] = tmp;  // 바뀜
                lt++;
                rt--;
            }
            String tmp2 = String.valueOf(c);
            answer.add(tmp2);
        }
        return answer;
    }


    public static void main(String[] args) {

        Six s = new Six();
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        String[] str = new String[count];
        for (int i = 0; i < count ; i++) {
            str[i] = sc.next();
        }

        for (String x : s.solution3(count,str)) {
            System.out.println(x);
        }

    }
}
