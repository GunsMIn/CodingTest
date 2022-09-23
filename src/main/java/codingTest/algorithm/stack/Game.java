package codingTest.algorithm.stack;

import java.util.Scanner;

 class GameTest {

        int random = (int) (Math.random() * 100) + 1;

        int count = 0;
        int answer;

        public void go() {
            Scanner sc = new Scanner(System.in);
            while(count!=10){
                count++;
                System.out.print("업다운게임 : ");
                answer = sc.nextInt();
                if (answer == random) {
                    System.out.println("정답입니다!!! count :" + count);
                    break;
                } else if (answer > random)
                    System.out.println("HIGH");
                else
                    System.out.println("LOW");
                System.out.println("정답은 " + random + "이었습니다.");

                sc.close();
            }
    }

    public class Game {

        public void main(String[] args) {
            GameTest test = new GameTest();
            test.go();
        }
    }

}
