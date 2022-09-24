package codingTest.algorithm;

/*
* 1. 모든 변수는 무조건 private(다이렉트로 값이 들어가면 매우 위험)
* 2. 모든 변수에 대해서 getter, setter 함수를 만들어서
*    값을 읽고 쓴다.(lombok)
* */
public class Clock {

    private int hour;
    private int min; // 정보 은닉  0~60분


    public int getHour() {
        return hour;
    }
    public int getMin() {
        return min;
    }


    public void setHour(int hour) {
        if(hour<0 || hour>23){
            System.out.println("시간을 다시 입력해주세요!");
            return;
        }
        this.hour = hour;
    }

    public void setMin(int min) {
        if (min < 0 || min > 59) {
            System.out.println("분을 다시입력해주세요!");
            return;
        }

        this.min = min;
    }
}
