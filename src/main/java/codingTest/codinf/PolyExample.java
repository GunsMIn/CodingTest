package codingTest.codinf;

import java.util.Random;
import java.util.Scanner;

public class PolyExample {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("가진 돈이 얼마입니까? : ");
        int money = sc.nextInt();
        Buyer b = new Buyer(money);

        Product[] products = {new Tv(), new Computer(),new Audio()};

        while (b.getMoney() > 0) {
            Random random = new Random();
            int i = random.nextInt(products.length);
            b.buy(products[i]);
        }
        b.summary();

    }
}
