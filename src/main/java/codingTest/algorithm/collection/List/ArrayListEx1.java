package codingTest.algorithm.collection.List;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEx1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("몇월이에요?");
        int month = sc.nextInt();

        switch (month){
            case 1: case 2: case 12 :
                System.out.println("겨울");
                break;
            case 3: case 4: case 5 :
                System.out.println("봄");
                break;
            case 6: case 7: case 8 :
                System.out.println("겨울");
                break;
            case 9: case 10: case 11 :
                System.out.println("가을");
                break;
            default:
                System.out.println("다시입력해주세요");
        }

    }
}
