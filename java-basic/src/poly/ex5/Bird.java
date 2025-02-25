package poly.ex5;

public class Bird extends AbstractAnimal implements Fly{

    @Override
    public void sound() {
        System.out.println("짹짹");
    }

    @Override
    public void fly() {
        System.out.println("새가 날아 다닙니다.");
    }
}
