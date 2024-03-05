package poly.ex3;

public abstract class AbstractAnimal { // 추상클래스는 직접 인스턴스를 생성할 수 없다.
    public abstract void sound(); // 추상 메서드: 자식이 오버라이딩 해야 함

    public void move() {
        System.out.println("동물이 움직입니다."); // 상속 용도
    }
}
