package codingTest.algorithm.arrays;

import java.util.Arrays;

public class ArraysEx {
    public static void main(String[] args) {

        int[] arr = {0, 1, 2, 3, 4};
        int[][] arr2D = {{11, 12, 13}, {21, 22, 23}};

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.deepToString(arr2D));

        int[] arr2 = Arrays.copyOf(arr, arr.length);
        int[] arr3 = Arrays.copyOf(arr, 3); // 개수
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));


        int[] arr7 = new int[5];
        Arrays.fill(arr7,9);
        System.out.println(Arrays.toString(arr7));

        //람다식으로 채우는 것
        Arrays.setAll(arr7,i -> (int)(Math.random()*6)+1); // 난수 채워짐
        System.out.println(Arrays.toString(arr7) );

        for (int i : arr7) {
           /* for (int x = 0; x <arr7.length ; x++) {
                int i = arr7[x]
            }*/
            char[] graph = new char[i];
            Arrays.fill(graph,'*');
            System.out.println(new String(graph)+i);
        }


    }




}
