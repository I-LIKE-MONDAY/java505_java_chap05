import package2.C;

public class Car4Ex {
    public static void main(String[] args) {
        Car4 myCar = new Car4();

        myCar.run();
        myCar.frontLeftTire = new KumhoTire2();
        myCar.frontRightTire = new KumhoTire2();

        myCar.run();

        /////////// 추가 ///////////
        Car5 car5 = new Car5();
        car5.run();

        car5.tires[2] = new KumhoTire2();
        car5.tires[3] = new KumhoTire2();

        car5.run();
    }
}
