package ref;

public class MethodChange1 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println("메서드 호출 전: a = " + a); // 10

        changePrimitive(a);
        System.out.println("메서드 호출 후: a = " + a); // 10 (a는 변화 없음)
    }

    static void changePrimitive(int x) {
        x = 20; // int x = a 와 같이 값을 복사해서 갖게 됨
    }
}
