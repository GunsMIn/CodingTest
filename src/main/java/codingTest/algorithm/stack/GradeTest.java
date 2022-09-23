package codingTest.algorithm.stack;

import java.util.Scanner;

public class GradeTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("수학, 과학, 영어 순으로 3개의 정수 입력 >> ");
        int math = sc.nextInt();
        int science = sc.nextInt();
        int english = sc.nextInt();
        Grade me = new Grade(math, science, english);
        System.out.println("평균은 "+me.average()); // average()는 평균을 계산하여 리턴
        sc.close();
    }


    static class Grade{
        private int math;
        private int science;
        private int english;

        public Grade() {;}

        public Grade(int math, int science, int english) {
            this.math = math;
            this.science = science;
            this.english = english;
        }

        public int getSum() {
            return math + science + english;
        }

        public double average() {
            return getSum() / 3.0;
        }


    }
}