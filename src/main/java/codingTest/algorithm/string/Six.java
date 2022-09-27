package codingTest.algorithm.string;

import java.util.ArrayList;
import java.util.Scanner;
/*N개의 단어가 주어지면 각 단어를 뒤집어 출력하는 프로그램을 작성하세요.


입력
첫 줄에 자연수 N(3<=N<=20)이 주어집니다.

두 번째 줄부터 N개의 단어가 각 줄에 하나씩 주어집니다. 단어는 영어 알파벳으로만 구성되어 있습니다.


출력
N개의 단어를 입력된 순서대로 한 줄에 하나씩 뒤집어서 출력합니다.


예시 입력 1

3
good
Time
Big
예시 출력 1

doog
emiT
giB*/
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
/*    public ArrayList<String> solution3(int count,String[] str){
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
    }*/

    public ArrayList<String> solution3(int count,String[] str) {
        ArrayList<String> answer = new ArrayList<>();
        for (String s : str) {
            char[] c = s.toCharArray();
            int lt =0;
            int rt = s.length() - 1;
            while (lt < rt) {
                char tmp = c[lt];
                c[lt] = c[rt];
                c[rt] = tmp;
                lt++;
                rt--;
            }
            answer.add(String.valueOf(c));
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
