package codingTest.algorithm.hashmap;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapEx {

    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();

        map.put("kim", "951110");
        map.put("kim", "999999");
        map.put("park", "940411");
        map.put("kim", "680723");

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("id와 password를 입력해주세요");
            String id = sc.nextLine().trim();
            if (!map.containsKey(id)) {
                System.out.println("입력하신 id는 존재하지 않습니다. 다시입력해주세요");
                continue;
            }

            String password = sc.nextLine().trim();

            if(map.get(id).equals(password)){
                System.out.println("로그인에 성공!");
                break;
            }
            else{
                System.out.println("비밀번호가 일치하지 않습니다 다시 입력해주세요");
            }

        }


    }





}
