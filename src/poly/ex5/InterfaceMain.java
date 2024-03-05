package poly.ex5;

import poly.ex4.AbstractAnimal;
import poly.ex4.Cat;
import poly.ex4.Caw;
import poly.ex4.Dog;

public class InterfaceMain {
    public static void main(String[] args) {
        //인터페이스 생성 불가
        //InterfaceAnimal interfaceAnimal = new InterfaceAnimal();

        poly.ex4.Dog dog = new Dog();
        poly.ex4.Cat cat = new Cat();
        poly.ex4.Caw caw = new Caw();

        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(caw);
    }

    //동물이 추가되어도 변하지 않는 코드
    private static void soundAnimal(AbstractAnimal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }
}
