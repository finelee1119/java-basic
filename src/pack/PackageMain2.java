package pack;

import pack.a.*;
public class PackageMain2 {
    public static void main(String[] args) {
        Data data = new Data(); // 사용자와 같은 위치
        User user = new User(); // 사용자와 다른 위치 (import 사용으로 패키지명 생략 가능)
    }
}
