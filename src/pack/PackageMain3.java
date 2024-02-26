package pack;

import pack.a.User;

public class PackageMain3 {
    public static void main(String[] args) {
        User userA = new User(); // 임포트 사용으로 패키지명 생략
        pack.b.User userB = new pack.b.User(); // 임포트는 한번만 쓸 수 있어서 얘는 패키지명 생략 불가
    }
}
