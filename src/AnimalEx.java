public class AnimalEx {

    public static void animalSound(Animal animal) {
        animal.sound();
    }

    public static void main(String[] args) {
        Dog dog = new Dog("멍멍이");
        Cat cat = new Cat("고양이");

        dog.breathe();
        dog.sound();
        cat.breathe();
        cat.sound();
        System.out.println("--------------------");



        // animal = new Animal(); <-- 오류발생: 추상클래스는 상속받아서만 사용 가능, 객체 생성 불가능

        // 추상 클래스 타입의 변수를 선언하는 것은 문제가 없음.
        Animal animal;

        // 클래스의 형변환(다형성)
        animal = new Dog("멍멍이");
        animal.sound(); // 결과 : 멍멍

        animal = new Cat("고양이");
        animal.sound(); // 결과 : 냐옹

        animalSound(new Dog("강아지"));    // 결과 : 강아지는 멍멍
        animalSound(new Cat("냐옹이"));    // 결과 : 냐옹이는 냐옹
    }
}
