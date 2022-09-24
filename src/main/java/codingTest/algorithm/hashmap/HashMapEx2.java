package codingTest.algorithm.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapEx2 {

    public static void main(String[] args) {

        String[] data = {"A", "K", "A", "D", "K", "A", "K", "K", "K", "Z", "D"};

        HashMap<String, Integer> map = new HashMap<>();
//
        for (int i = 0; i < data.length ; i++) {
            if (map.containsKey(data[i])) {
                //값을 포함하고 있다면 기존값 +1
                Integer value = map.get(data[i]);
                map.put(data[i], value + 1);
            }else{
                //처음이면 1을 넣어주자!
                map.put(data[i], 1);
            }
        }

        Iterator<Map.Entry<String, Integer>> it = map.entrySet().iterator();

        while (it.hasNext()) {
            System.out.println(it.next());

        }


    }


}
