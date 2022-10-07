public class Cat extends Animal{
    public Cat(String kind) {
        super(kind);
    }

    @Override
    public void sound() {
        System.out.println(kind + "는 냐옹");
    }
}
