package poly.ex1;

public class AnimalSoundMain2 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();
        Duck duck = new Duck();
        Animal[] animals = {dog, cat, cow, duck};

        for (Animal animal : animals) {
            System.out.println("동물 소리 테스트 시작");
            animal.sound(); // 메서드 오버라이딩
            System.out.println("동물 소리 테스트 종료");
        }

    }
}
