package codingTest.algorithm.StringBuffer;

public class Equals {

    public static void main(String[] args) {
        StringBuffer buffer = new StringBuffer("abc");
        StringBuffer buffer2 = new StringBuffer("abc");


        //StringBuffer은 String과는 다르게 equals가 오버라이딩 되어있지 않다.
        //반면 .toString은 오버라이딩되어서  문자열을 비교할때에는 toStirng을 해주어서 비교하자!
        System.out.println(buffer.equals(buffer2));//false
        System.out.println(buffer==buffer2);//false

        String b1 = buffer.toString();
        String b2 = buffer2.toString();

        System.out.println(b1.equals(b2)); //true
        System.out.println(b1==b2); //false


    }
}
