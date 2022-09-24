package codingTest.algorithm.set;

import java.util.*;

public class SetEX2 {

    public static void main(String[] args) {

        Set set = new HashSet();

        for (int i = 0; set.size()<8; i++) {
            int num = (int)(Math.random()*45)+1;
            set.add(num);
        }
        System.out.println("set = " + set);
        System.out.println("=========set=========");


        //set은 정렬을 할 수가 없다
        //collection에서 정렬은 list만 가능하다.
        // 정렬은 순서를 부여해야 하니까 순서가 유지되어야한다
        List setList = new LinkedList<>(set);
        Collections.sort(setList);
        System.out.println("setList = " + setList);



    }


}
