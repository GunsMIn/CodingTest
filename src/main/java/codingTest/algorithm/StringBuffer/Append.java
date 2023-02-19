package codingTest.algorithm.StringBuffer;



public class Append {

    public static void main(String[] args) {
        //StringBuffer클래스의 append 기능
        StringBuffer sb = new StringBuffer("ABC");

        sb.append(123);
        System.out.println("sb = " + sb);

        StringBuffer sb2 = sb.append("ZZ");
        System.out.println("sb2 = " + sb2);

        //sb2에서 숫자지우기
        sb2.delete(3, 6);
        System.out.println("sb2 = " + sb2);
        //
    }
}
