public class Penguin extends Animal implements Walk,Swim{

    private int walkSpeed;
    private int SwimSpeed;
    private boolean isSwimming;

    public int getWalkSpeed() {
        return walkSpeed;
    }

    public void setWalkSpeed(int walkSpeed) {
        this.walkSpeed = walkSpeed;
    }

    public int getSwimSpeed() {
        return SwimSpeed;
    }

    public void setSwimSpeed(int swimSpeed) {
        SwimSpeed = swimSpeed;
    }

    public boolean isSwimming() {
        return isSwimming;
    }

    public void setSwimming(boolean swimming) {
        isSwimming = swimming;
    }

    @Override
    public void eatingCompleted() {
        System.out.println("Penguin: I am eating delicious fish");
    }

    public Penguin(String nameOfAnimal) {
        super(nameOfAnimal);
    }

    @Override

    public void walking(){
        System.out.println("I am walking at the speed "+walkSpeed+" mph");
    }
    public void swimming(){
        System.out.println("i am swimming at the speed of "+SwimSpeed+" nautical miles per hour");
    }
}
