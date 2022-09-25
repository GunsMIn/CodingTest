package codingTest.JAVA8.ramda.tow;

import java.util.Arrays;
import java.util.function.Function;

public class Foo {
    public static void main(String[] args) {
        Plus10 plus10 = new Plus10();
        Integer apply = plus10.apply(1);
        System.out.println(apply);



        //2함수의 조합 //첫번째 파라미터 타입 ,두번째 리턴값의 타입
        Function<Integer,Integer> plus = (i) ->{
            return i+10;
        };

        //첫번째 파라미터 타입 ,두번째 리턴값의 타입
        Function<Integer,Integer> multiply = (i) ->{
            return i*2;
        };

        //y.compose(x) : x에 대한 람다를 먼저 진행하고 그 값을 y의 람다 메소드에서 입력값으로
        //사용한다.
        Function<Integer, Integer> multiplyAndPlus = plus10.compose(multiply);

        System.out.println("=====람다식의 조합=====");
        System.out.println(multiplyAndPlus.apply(3));



    }

}
