package codingTest.algorithm.classs;

import java.util.Scanner;

public class StringTest {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        int sum = 0;
        double average;
        System.out.println("국어점수를 입력해주세요 :");
        int koreanLanguage = sc.nextInt();
        System.out.println("수학점수를 입력해주세요 :");
        int math = sc.nextInt();
        System.out.println("영어점수를 입력해주세요 :");
        int english = sc.nextInt();
        Grade grade = new Grade(koreanLanguage,math,english);

        sum = grade.english + grade.math + grade.koreanLanguage;
        average = (double) sum / 3;

        if (average >= 90) {
            System.out.println("점수 :수");
        } else if (average >= 80) {
            System.out.println("점수 :우");
        }else{
            System.out.println("점수 :미");
        }






    }

    static class Grade{

        int koreanLanguage;
        int math;
        int english;

        public Grade(int koreanLanguage, int math, int english) {
            this.koreanLanguage = koreanLanguage;
            this.math = math;
            this.english = english;
        }


        public void setKoreanLanguage(int koreanLanguage) {
            this.koreanLanguage = koreanLanguage;
        }

        public void setMath(int math) {
            this.math = math;
        }

        public void setEnglish(int english) {
            this.english = english;
        }
    }



}
