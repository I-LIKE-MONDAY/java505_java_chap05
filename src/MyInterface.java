public interface MyInterface {
    public void method1();

//    해당 interface 를 구현하는 구현체가 여러 개가 존재할 경우에 구현체의 수정 없이 기능을 추가하고자 하는 경우에 사용하는 것이 디폴트 메서드임
    default void method2() {
        System.out.println("dMyInterface의 method2() 실행");
    }
}
