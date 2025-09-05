public class Dolphin extends Animal implements Swim{
    private int swimmingSpeed;

    public Dolphin(String nameOfAnimal) {
        super(nameOfAnimal);
    }

    private String colorOfDolphin;

    public int getSwimmingSpeed() {
        return swimmingSpeed;
    }

    public void setSwimmingSpeed(int swimmingSpeed) {
        this.swimmingSpeed = swimmingSpeed;
    }

    public String getColorOfDolphin() {
        return colorOfDolphin;
    }

    public void setColorOfDolphin(String colorOfDolphin) {
        this.colorOfDolphin = colorOfDolphin;
    }

    @Override
    public void eatingCompleted() {
        System.out.println("Dolphin: I am eating delicious fish");
    }

    @Override
    public void swimming() {
        System.out.println("i am swimming at the speed of "+swimmingSpeed+"nautical miles per hour");
    }
}
