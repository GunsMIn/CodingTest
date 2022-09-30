package codingTest.codinf;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Buyer {

    private int money = 0;

    Product[] cart = new Product[3]; // 구입한 제품을 저장하기 위한 배열

    //추후에 ArrayList를 배열 대신 사용함.
    List<Product> listCart = new ArrayList<>();

    int cnt = 0; // Product배열 cart에 사용될 index

    public Buyer(int money) {
        this.money = money;
    }

    public int getMoney() {
        return money;
    }

    //구매
    public void buy(Product p) {
        //잔액 부족 시 검증
        if(money < p.getPrice()) {
            System.out.println("현재 잔액이 부족합니다" + p.toString() +
                    "을 구입하려면 적어도 "+ p.getPrice()+"원이 필요합니다");
            return;//메소드 강제 탈출
        }
        //일반 구매 로직
            this.money -= p.getPrice();
            System.out.println(p+"("+p.getPrice()+"원)를 구매하여 현재 잔액은"+money+"원 입니다" );
            add(p);//장바구니에 넣기
    }


    //장바구니 담기
    public void add(Product p) {
        if(cnt >= cart.length){
            //기존 cart에 2배가 되는 배열 생성
            //Arrays.copyOf(복사할 배열, 복사할 배열의 길이)
            Product[] extendCart = Arrays.copyOf(cart, cart.length * 2);
            cart = extendCart;
        }
        cart[cnt++] = p;
    }


    //구매목록과 총액
    public void summary() {
        int sum = 0;
        System.out.print("구매한 물건: ");
        for(int i = 0; i < cnt; i++){ //cnt는 장바구니의 개수
            System.out.print(cart[i].toString()+",");
            sum += cart[i].getPrice();
        }
        //System.out.println("\n총 " + cart.length+"개를 구입하셨습니다.");
        System.out.println("\n사용한 금액: " +sum);
        System.out.println("남은 금액: " + money);
    }



}
