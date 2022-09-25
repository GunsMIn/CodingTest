package codingTest.JAVA8.ramda.one;

public class Foo {

    public static void main(String[] args) {

        RunSomething runSomething = () -> System.out.println("나는 람다");
        runSomething.doit();

        RunSomthing2 runSomthing2 = (i) -> {
            System.out.println(i+"살입니다");
        };
        runSomthing2.getIt(28);

    }
}
