package oop1.ex;

public class Rectangle {
    // 멤버 변수
    int width;
    int height;

    // 메서드
    int calculateArea() {
        return width * height;
    }

    int calculatePerimeter() {
        return 2 * (width + height);
    }

    boolean isSquare() {
        return width == height;
    }

}
