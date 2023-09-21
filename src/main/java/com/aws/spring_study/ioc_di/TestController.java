package com.aws.spring_study.ioc_di;

public class TestController {
//    private TestService1 t;
    private TestService t;

    // controller를 생성할 때 TestService1을 생성 하는 것이 아니라 외부 에서 의존성을 주입
    // 이것을 spring이 자동으로 해주는게 IoC개념
    // 자바에서는 다형성을 위해 부모클래스의 참조 변수로 자식 클래스의 인스턴스를 참조 할 수 있다
    public TestController(TestService t) {
        // t = new TestService1(); <- 이렇게 IoC에 등록 하는 것은 의존성이 높음
        this.t = t;
    }

    public void control() {
        t.aaa();
    }
}
