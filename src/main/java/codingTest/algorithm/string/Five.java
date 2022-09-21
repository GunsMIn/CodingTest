package codingTest.algorithm.string;

import java.util.Scanner;
/*N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.
        입력
        첫째 줄에 숫자의 개수 N (1 ≤ N ≤ 100)이 주어진다. 둘째 줄에 숫자 N개가 공백없이 주어진다.
        출력
        입력으로 주어진 숫자 N개의 합을 출력한다.

        예제 입력 1
        1
        1
        예제 출력 1
        1
        예제 입력 2
        5
        54321*/
public class Five {

    public int sum(int count,String math){
        int sum=0;
        for (int i = 0; i < count ; i++) {
            sum += math.charAt(i)-48;
            //charAt() 은 해당 문자의 아스키코드 값을 반환하므로 반드시
            // -48 또는 -'0' 을 해주어야 우리가 입력받은 숫자 값(진짜 숫자)을 반환
        }
        return sum;
    }


    public static void main(String[] args) {
        System.out.println("숫자를 입력해주세요 : ");
        Scanner sc = new Scanner(System.in);
        Five five = new Five();
        int count = sc.nextInt();
        String math = sc.next();
        System.out.println(five.sum(count,math));

    }
}
