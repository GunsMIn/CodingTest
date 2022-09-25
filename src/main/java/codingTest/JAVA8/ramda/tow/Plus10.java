package codingTest.JAVA8.ramda.tow;

import java.util.function.Function;

                                //첫번째 파라미터 타입 ,두번째 리턴값의 타입
public class Plus10 implements Function<Integer,Integer> {
    @Override
    public Integer apply(Integer integer) {
        return integer +10;
    }
}
