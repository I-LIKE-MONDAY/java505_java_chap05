public class MyClassA implements MyInterface{


    @Override
    public void method1() {
        System.out.println("MyClassA의 method1() 실행");
    }
//    메서드2번 오버라이드 안해도 됨(default메서드라서), 해도 상관X
    /*@Override
    public void method2() {
        System.out.println("MyClassA의 method2() 실행");
    }*/
}
