public class Car5 {
    Tirei[] tires = new Tirei[4];

//    방법 1 : 배열 선언과 동시에..
//    Tirei[] tires = {
//            new HankookTire2(),
//            new HankookTire2(),
//            new HankookTire2(),
//            new HankookTire2(),
//    }

//    방법 2 : 생성자에서 for문 사용
    public Car5() {
        for (int i=0; i < tires.length; i++) {
            tires[i] = new HankookTire2();
        }
    }

    void run() {
        for (Tirei item : tires) {
            item.roll();
        }
    }


}
