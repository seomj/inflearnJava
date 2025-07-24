package generic.ex3;

public class AnimalHospitalV2<T> {

    private T animal;

    public void set(T animal){
        this.animal = animal;
    }

    public void checkup(){
        animal.toString();
        animal.equals(null);

        // System.out.println("동물 이름: " + animal.getName());
        // animal.sound();
    }

    public T getBigger(T target){
        // return animal.getSize() > target.getSize() ? animal : target;
        return null;
    }
}
