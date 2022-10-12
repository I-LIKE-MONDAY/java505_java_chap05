import package1.B;
import package2.D;

public class Driver2Ex {
    public static void main(String[] args) {

        System.out.println("각각 객체를 생성하여 실행");
        Bus2 bus2 = new Bus2();
        Taxi2 taxi2 = new Taxi2();

        bus2.run();
        taxi2.run();

        System.out.println("\n익명 객체를 통한 구현");
//        오류 : 인터페이스타입은 객체생성 불가능
//      Vehicle2 vehicle2 = new Vehicle2();
//        익명객체 생성해서 사용하면 됨
        Vehicle2 vehicle2 = new Vehicle2() {
            @Override
            public void run() {
                System.out.println("탈것이 달립니다.");
            }
        };  // 익명객체 생성시 중괄호 끝에 세미콜론!
        vehicle2.run();

        System.out.println("\n부모 인터페이스 타입의 변수에 자식 객체를 대입");
        vehicle2 = bus2;
        vehicle2.run();
        vehicle2 = taxi2;
        vehicle2.run();

        System.out.println("\n인터페이스 변수를 매개변수로 사용 시");
        Driver2 driver2 = new Driver2();
        driver2.drive(bus2);
        driver2.drive(taxi2);


        System.out.println("\n자동 타입변환, 강제 타입변환, instanceof\n");
        /////// 자동 타입 변환, 부모인 Vehicle2 인터페이스 타입의 변수에 자식인 Bus2클래스 타입의 객체를 대입 ///////
        Vehicle2 vehicle21 = new Bus2();
        vehicle21.run();

//        오류 발생 : 데이터 타입이 다르므로 강제 타입변환을 시도해야 함
//        Bus2 bus21 = vehicle21;
        Bus2 bus21 = (Bus2) vehicle21;  // 강제 타입 변환
        bus21.run();
        
//        강제 타입 변환의 조건 : 원본이 자식 클래스 타입의 객체일때 해당 클래스 타입으로 변환 시 가능 -> instanceof 로 확인가능
//        원본 클래스 객체 타입이 맞는지 확인을 하기 위해서는 instanceof 연산자를 사용해야 함
        Vehicle2 vehicle22 = new Bus2();
        vehicle22.run();

//        런타임 에러 발생
//        Taxi2 taxi22 = (Taxi2) vehicle22;
//        taxi22.run();

        if (vehicle22 instanceof Taxi2) {
            Taxi2 taxi22 = (Taxi2) vehicle22;
            taxi22.run();
            System.out.println("정상적으로 Taxi2 클래스 타입으로 변경 했습니다.");
        }
        else {
            System.out.println("Taxi2 클래스 타입으로 변경할 수 없습니다.");
        }
    }
}
