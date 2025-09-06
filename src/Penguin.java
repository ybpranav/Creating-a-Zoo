public class Penguin extends Animal{
    @Override
    public void eatingCompleted() {
        System.out.println("Dolphin: I am eating delicious fish");
    }

    public Penguin(String nameOfAnimal) {
        super(nameOfAnimal);
    }

}
