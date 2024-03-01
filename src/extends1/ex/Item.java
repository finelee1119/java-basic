package extends1.ex;

public class Item {
    //멤버변수
    private String name;
    private int price;

    //생성자
    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }

    //메서드
    public int getPrice() {
        return price;
    }

    public void print() {
        System.out.println("이름:"+name+", 가격:"+price);
    }
}
