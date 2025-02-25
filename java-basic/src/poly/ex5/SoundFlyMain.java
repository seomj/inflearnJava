package poly.ex5;

public class SoundFlyMain {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Bird bird = new Bird();
        Chicken chicken = new Chicken();

        soundAnimal(dog);
        soundAnimal(bird);
        soundAnimal(chicken);

        //flyAnimal(dog);
        flyAnimal(bird);
        flyAnimal(chicken);

    }

    private static void soundAnimal(AbstractAnimal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound(); // 메서드 오버라이딩
        System.out.println("동물 소리 테스트 종료");
    }

    private static void flyAnimal(Fly fly){
        System.out.println("날기 테스트 시작");
        fly.fly();
    }
}
