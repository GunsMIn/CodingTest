package codingTest.JAVA8.stream;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();

        names.add("kim");
        names.add("park");
        names.add("lee");
        names.add("cho");

        //stream에는 중개오퍼레이션과 종료오퍼레이션이 있다

        /* !!!!!!!중요!!!!!!!!!
        *
        *   1.중개 오퍼레이션
        *   Stream을 리턴한다
        *
        *   2.종료 오퍼레이션
        *   Stream을 리턴하지 않는다.
        *
        * 데이터를 담고 있는 저장소 (컬렉션)이 아니다.
        * 중개 오퍼레이션은 근본적으로 lazy 하다. 손쉽게 병렬 처리할 수 있다.
        * */


        names.stream().map(String::toUpperCase)
                .forEach(s -> System.out.println(s));


    }
}
