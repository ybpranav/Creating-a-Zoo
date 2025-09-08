//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // for getting input
        Scanner keyboard = new Scanner(System.in);
        Tiger tigerObject=new Tiger("Tiger");
        Dolphin dolphinObject=new Dolphin("Dolphin");
        Penguin penguinObject=new Penguin("Penguin");

        // for loop continuation - 1 represents true
        int continueOuterLoop = 1  ;
        int continueInnerLoop = 1;

        // for menu choice
        int menuChoice = 1;


        do {
            switch (animalChoiceMenu(keyboard)) {
                case 1:
                    do {
                        System.out.println("The animal which is chosen is : "+tigerObject.getNameOfAnimal());
                        // get menu choice
                       menuChoice= animalDetailsManipulationMenu(keyboard,tigerObject);
                        switch (menuChoice) {
                            case 1:System.out.println("Enter the height");
                                    tigerObject.setHeight(keyboard.nextInt());
                                System.out.println("Enter the weight");
                                tigerObject.setWeight(keyboard.nextInt());
                                System.out.println("Enter the Age");
                                tigerObject.setAge(keyboard.nextInt());
                                System.out.println("Enter the number of strips");
                                tigerObject.setNumberOfStripes(keyboard.nextInt());
                                System.out.println("Enter the speed");
                                tigerObject.setSpeed(keyboard.nextInt());
                                System.out.println("Enter the sound level of roar");
                                tigerObject.setSoundLevelOfRoar(keyboard.nextInt());

                                break;

                            case 2:System.out.println("Height : "+tigerObject.getHeight());
                                System.out.println("Weight : "+tigerObject.getWeight());
                                System.out.println("Age : "+tigerObject.getAge());
                                System.out.println("Speed : "+tigerObject.getSpeed());
                                System.out.println("Number of strips : "+tigerObject.getNumberOfStripes());
                                System.out.println("Level of roar sound : "+tigerObject.getSoundLevelOfRoar());
                                break;
                            case 3:tigerObject.walking();
                                break;
                            case 4:tigerObject.eatingFood();
                            tigerObject.eatingCompleted();
                                break;
                            default:
                                System.out.println("Not supported");

                        }
                        System.out.println("Continue with this animal ? (Enter 1 for yes/ 2 for no):");
                        continueInnerLoop = keyboard.nextInt();
                    } while(continueInnerLoop == 1);

                    break;
                case 2:
                    do {
                        System.out.println("The animal which is chosen is : "+dolphinObject.getNameOfAnimal());
                        // get menu choice
                        menuChoice=animalDetailsManipulationMenu(keyboard,dolphinObject);
                        switch (menuChoice) {
                            case 1:System.out.println("Enter the height");
                                dolphinObject.setHeight(keyboard.nextInt());
                                System.out.println("Enter the weight");
                                dolphinObject.setWeight(keyboard.nextInt());
                                System.out.println("Enter the Age");
                                dolphinObject.setAge(keyboard.nextInt());
                                System.out.println("Enter the swimming speed");
                                dolphinObject.setSwimmingSpeed(keyboard.nextInt());
                                keyboard.nextLine();
                                System.out.println("Enter the color of dolphin");
                                dolphinObject.setColorOfDolphin(keyboard.nextLine());
                                break;

                            case 2:System.out.println("Height : "+dolphinObject.getHeight());
                                System.out.println("Weight : "+dolphinObject.getWeight());
                                System.out.println("Age : "+dolphinObject.getAge());
                                System.out.println("Speed : "+dolphinObject.getSwimmingSpeed());
                                System.out.println("Dolphin color : "+dolphinObject.getColorOfDolphin());

                                break;
                            case 3:dolphinObject.swimming();
                                break;
                            case 4:dolphinObject.eatingFood();
                            dolphinObject.eatingCompleted();
                                break;
                            default:
                                System.out.println("Not supported");

                        }
                        System.out.println("Continue with this animal ? (Enter 1 for yes/ 2 for no):");
                        continueInnerLoop = keyboard.nextInt();
                    } while(continueInnerLoop == 1);

                    break;
                case 3:

                    do {
                        System.out.println("The animal which is chosen is : "+penguinObject.getNameOfAnimal());
                        // get menu choice
                        menuChoice=animalDetailsManipulationMenu(keyboard,penguinObject);
                        switch (menuChoice) {
                            case 1:System.out.println("Enter the height");
                                penguinObject.setHeight(keyboard.nextInt());
                                System.out.println("Enter the weight");
                                penguinObject.setWeight(keyboard.nextInt());
                                System.out.println("Enter the Age");
                                penguinObject.setAge(keyboard.nextInt());
                                System.out.println("Is the dolphin swimming (true/false)");
                                penguinObject.setSwimming(keyboard.nextBoolean());
                                System.out.println("Enter the walk speed of the penguin");
                                penguinObject.setWalkSpeed(keyboard.nextInt());
                                System.out.println("Enter the swim speed of the penguin");
                                penguinObject.setSwimSpeed(keyboard.nextInt());
                                break;

                            case 2:System.out.println("Height : "+penguinObject.getHeight());
                                System.out.println("Weight : "+penguinObject.getWeight());
                                System.out.println("Age : "+penguinObject.getAge());
                                System.out.println("Walking Speed : "+penguinObject.getWalkSpeed());
                                System.out.println("Swimming Speed : "+penguinObject.getSwimSpeed());

                                break;
                            case 3:if(penguinObject.isSwimming()){
                                penguinObject.swimming();
                            }else{
                                penguinObject.walking();
                            }
                                break;
                            case 4:penguinObject.eatingFood();
                                penguinObject.eatingCompleted();
                                break;
                            default:
                                System.out.println("Not supported");

                        }
                        System.out.println("Continue with this animal ? (Enter 1 for yes/ 2 for no):");
                        continueInnerLoop = keyboard.nextInt();
                    } while(continueInnerLoop == 1);

                    break;
                default:
                    System.out.println("Sorry no such animal available.");
            }

            System.out.println("Continue main Zoo menu? (Enter 1 for yes/ 2 for no):");
            continueOuterLoop = keyboard.nextInt();

        } while(continueOuterLoop == 1);


    }

    private static int animalChoiceMenu(Scanner keyboard) {
        int choiceGivenByUser;

        System.out.println("******* ZOO ANIMAL choice menu ******");
        System.out.println("1. Tiger");
        System.out.println("2. Dolphin");
        System.out.println("3. Penguin");

        System.out.println("Enter choice of animal:");
        choiceGivenByUser = keyboard.nextInt();
        return choiceGivenByUser;
    }

    private static int animalDetailsManipulationMenu(Scanner keyboard, Animal animal) {
        int choiceGivenByUser;

        System.out.println("******* ANIMAL details menu for: " + animal.getNameOfAnimal() + " ******");
        System.out.println("1. Set properties");
        System.out.println("2. Display properties");
        System.out.println("3. Display movement");
        System.out.println("4. Display eating");

        System.out.println("Enter choice (1-4):");
        choiceGivenByUser = keyboard.nextInt();
        return choiceGivenByUser;

    }
}



