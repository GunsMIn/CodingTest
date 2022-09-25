package codingTest.JAVA8.stream;

import java.util.ArrayList;
import java.util.List;

public class ClassTest {

    public static void main(String[] args) {

        List<OnlineClass> springClasses = new ArrayList<>();

        springClasses.add(new OnlineClass(1, "spring boot", true));
        springClasses.add(new OnlineClass(2, "spring data jpa", true));
        springClasses.add(new OnlineClass(3, "spring mvc", false));
        springClasses.add(new OnlineClass(4, "spring core", false));
        springClasses.add(new OnlineClass(5, "reat api development", false));

        //문제 1
        System.out.println("spring으로 시작하는 수업");
        springClasses.stream()
                .filter(s -> s.getTitle().startsWith("spring"))
                .forEach(s -> System.out.println("spring으로 시작 하는 온라인 클래스 : " + s));


        //문제2
        System.out.println("close되지 않은 수업");
        springClasses.stream()
                .filter(oc -> !oc.isClosed()) // 수업이 종료되지 않았다
                .forEach(i -> System.out.println("closed되지 않은 클래스 " + i));

        //문제3
        System.out.println("클래스 이름만 모아서 스트림 만들기");
        springClasses.stream().map(oc -> oc.getTitle()) // OnlineClass ---> String
                .forEach(oc -> System.out.println("쿨래스 이름 : " + oc));


        //////////////////////////////////////////////////////////////////////////



        List<OnlineClass> javaClasses = new ArrayList<>();

        javaClasses.add(new OnlineClass(6, "The java, Test", true));
        javaClasses.add(new OnlineClass(7, "The java, code maipulation", true));
        javaClasses.add(new OnlineClass(8, "The java, 8 to 11", false));


        //리스트를 담고 있는 리스트!
        List<List<OnlineClass>> backendClass = new ArrayList<>();
        backendClass.add(springClasses);
        backendClass.add(javaClasses);

        System.out.println("두 수업의 목록에 들어있는 모든 수업 아이디 출력");
        backendClass.stream()
                .flatMap(list -> list.stream()) //list를 stream으로 바꿔줌
                .forEach(oc -> System.out.println(oc.getId()));

    }






}
