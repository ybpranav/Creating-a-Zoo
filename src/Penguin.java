public class Penguin extends Animal implements Walk,Swim{

    private int speed;

    public int getSwimming() {
        return swimming;
    }

    public void setSwimming(int swimming) {
        this.swimming = swimming;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    private int swimming;
    @Override
    public void eatingCompleted() {
        System.out.println("Penguin: I am eating delicious fish");
    }

    public Penguin(String nameOfAnimal) {
        super(nameOfAnimal);
    }

    @Override

    public void walking(){

    }
    public void swimming(){

    }
}
