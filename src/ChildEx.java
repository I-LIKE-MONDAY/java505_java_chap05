import package2.C;

public class ChildEx {
    public static void main(String[] args) {

        Parent parent = new Parent();  // 부모 클래스 객체 생성
        parent.method1(); // 결과 : Parent-method1
        parent.method2(); // 결과 : Parent-method2

        System.out.println("--------------");
        
        // Parent 상속받은 Child
        // 객체 생성. Child()에는 method1이 없음, method2는 오버라이드 되어있음
        Child child = new Child();

        child.method1(); // 결과 : Parent-method1 (상속받은 메소드)
        child.method2(); // 결과 : Child-method2()
        child.method3(); // 결과 : Child-method3()

        System.out.println("--------------");

        // 다형성 : 부모 클래스 타입의 변수에 자식 클래스 타입의 객체를 대입하여 부모 클래스 타입의 객체인 것처럼 사용하는것,
        //         실제 결과물은 자식 클래스 타입의 객체가 가지고 있는 데이터로 출력이 되는것.

        parent = child; // parent 클래스 타입(부모)에 child 객체(자식) 대입 - 문제없음

        parent.method1(); // 결과 : Parent-method1

        parent.method2(); // 결과 : Child-method2() <-- WHY? 껍데기는 부모처럼 생겼지만 알맹이는 Child객체이기때문.

        // parent.method3(); : 실행이 안됨 <-- WHY? 알맹이는 Child인데 왜 안되는가?
        //                     일단은 부모클래스 타입으로 로드가 되었기때문에 자식클래스에서 전용으로 있던것은 숨겨짐.
        //                     원래 부모님이 하셨던 행동만 사용 가능
        //                     (= 부모 클래스에 없던 메소드<자식클래스에만 있던 메소드>는 사용 불가능)
        //                     부모 클래스 타입의 변수에 자식 클래스 타입의 갹체를 대입했을 경우
        //                     자동 형변환이 발생하여 자식 클래스 타입의 객체가 전용으로 가지고 있던 멤버를 활용할 수 없음.
        //                     부모 클래스 멤버만 사용할 수 있음.
    }
}
