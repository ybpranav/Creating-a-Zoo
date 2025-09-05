public class Dolphin extends Animal{
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
}
