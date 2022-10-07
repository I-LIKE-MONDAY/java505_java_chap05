public class Dog extends Animal{

    public Dog(String kind) {
        super(kind);
    }

    @Override
    public void sound() {
        System.out.println(kind + "는 멍멍");
    }
}
