public class ImplEx {
    public static void main(String[] args) {
        System.out.println("구현체 implC의 객체 impl은 모든 메서드 사용 가능");
        ImplC impl = new ImplC();

        impl.methodA();
        impl.methodB();
        impl.methodC();

        System.out.println("\nInterfaceA의 변수에 대입 시 ");
        InterfaceA ifA = impl;
        ifA.methodA();  // 메서드A 만 사용 가능

        System.out.println("\nInterfaceB의 변수에 대입 시 ");
        InterfaceB ifB = impl;
        ifB.methodB();  // 메서드B 만 사용 가능

        System.out.println("\nInterfaceC의 변수에 대입 시 ");
        InterfaceC ifC = impl;
        impl.methodA();
        impl.methodB();
        impl.methodC(); // 메서드 A, B, C 모두 사용 가능
    }
}
