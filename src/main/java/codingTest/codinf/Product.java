package codingTest.codinf;

public class Product {

    private int price; // 제품의 가격

    public Product(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        if (price < 0) {
            System.out.println("가격은 0이상의 값이어야 합니다");
            return;
        }
        this.price = price;
    }
}

