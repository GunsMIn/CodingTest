package codingTest.JAVA8.ramda.one;

@FunctionalInterface
public interface RunSomething {
    //추상메소드가 1개만 있으면 함수형인터페이스
    public void doit();

    //자바 8의 새로운기능 static메소드
    public static void printName(){
        System.out.println("gunwoo");
    }

}
