package codingTest.algorithm.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetEx {
    public static void main(String[] args) {
        //set은 순서를 유지하지않고 중복된요소도 허용하지 않는다.
        Object[] objects = {"1", Integer.valueOf(1) ,"2", "2", "3", "4", "4", "4"};

        Set set = new HashSet();

        for (int i = 0; i < objects.length ; i++) {
            System.out.println(objects[i]+":"+set.add(objects[i]));
        }

        System.out.println("set = " + set);

        Iterator it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }


    }





}
