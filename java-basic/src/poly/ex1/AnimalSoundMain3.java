package poly.ex1;

public class AnimalSoundMain3 {
    public static void main(String[] args) {
        Animal[] animals = {new Dog(), new Cat(), new Cow()};

        for (Animal animal : animals) {
            soundAnimal(animal);
        }
    }

    private static void soundAnimal(Animal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound(); // 메서드 오버라이딩
        System.out.println("동물 소리 테스트 종료");
    }
}
