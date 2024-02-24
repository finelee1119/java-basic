package construct;

public class MemberConstruct {
    String name;
    int age;
    int grade;

    // 생성자
    // 1. 클래스 이름과 같아야 함
    // 2. 반환 타입 없음
    // 3. 나머지는 메서드와 같음
    MemberConstruct(String name, int age) {
        this(name, age, 50); // this() : 생성자 내부에서 자신의 생성자 호출 가능 (중복 제거 효과)
        // 첫줄에만 작성 가능
    }

    MemberConstruct(String name, int age, int grade) {
        System.out.println("생성자 호출 name=" + name + ",age=" + age + ",grade=" + grade);
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
