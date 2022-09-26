package codingTest.JAVA8.optional;


import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class App {

    public static void main(String[] args) {
        List<OnlineClass> springClasses = new ArrayList<>();

        springClasses.add(new OnlineClass(1, "spring boot", true));
        springClasses.add(new OnlineClass(2, "spring data jpa", true));
        springClasses.add(new OnlineClass(3, "spring mvc", false));
        springClasses.add(new OnlineClass(4, "spring core", false));
        springClasses.add(new OnlineClass(5, "reat api development", false));

        OnlineClass springBoot = new OnlineClass(1, "String", true);

        //참조형 타입은 기본값이 Null이다.!!!!

        Optional<OnlineClass> optional = springClasses.stream().filter(oc -> oc.getTitle().startsWith("spring"))
                .findFirst();

       //이렇게 뽑아야 좋다.
        optional.ifPresent(oc -> System.out.println(oc.getTitle()));

    }
}
