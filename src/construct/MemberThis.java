package construct;

public class MemberThis {
    String nameField;

    void initMember(String nameParameter) {
        nameField = nameParameter; // 멤버변수와 매개변수의 이름이 다르므로 this 안 써줘도 무방
    }
}
