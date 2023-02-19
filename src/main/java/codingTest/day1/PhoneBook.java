package codingTest.day1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class PhoneBook {


    /**
     * 1. 전화번호부가 배열로 주어진다.
     * 2. 우선 처음의 방법은 1중 루프를 돌면서 접두어가 있는지 확인해보자.
     * 3. sorting 진행해보자!
     *
     * **/

    public boolean solution(String[] phoneBook) {
        Arrays.sort(phoneBook);
        //전화번호부의 마지막 배열의 전까지만 루프를 돌자!
        for (int i = 0; i < phoneBook.length - 1; i++) {
            if (phoneBook[i+1].startsWith(phoneBook[i])) {
                return false;
            }
        }
        return true;
    }


    public boolean solution2(String[] phoneBook) {
        Map<String, String> map = new HashMap<>();

        for (String s : phoneBook) {
            map.put(s, "prefix");
        }

        //12 241 1
        //자기 자신을 비교하는것을 방지하기위해 문자열.length -1 까지만 substring 해주자
        for (String key : map.keySet()) {
            for (int i = 0; i < key.length()-1; i++) {
                if (map.containsKey(key.substring(i))) {
                    return false;
                }
            }
        }
        return true;
    }
}
