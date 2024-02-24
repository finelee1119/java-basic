package construct;

public class MemberInit {
    // 멤버변수
    String name;
    int age;
    int grade;

    // 메서드
    void initMember(String name, int age, int grade) {
        this.name = name; // 멤버변수와 매개변수의 이름이 같을 때, 둘을 구분하기 위해 멤버변수 앞에 this 적어주기
        this.age = age; // this : 인스턴스 자신
        this.grade = grade; // this. : 인스턴스 자신의 참조값(인스턴스의 멤버변수에 접근)
    }
}
