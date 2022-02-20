package lab.oodp.ood.animals;

/**
 * Main program for Exercise Two.
 */
public class AnimalProgram {

    public void start() {

        IAnimal[] animals = new IAnimal[3];

        // TODO Populate the animals array with a Bird, a Dog and a Horse.

        animals[0] = new Bird();
        animals[1] = new Dog();
        animals[2] = new Horse();

        processAnimalDetails(animals);

    }

    private void processAnimalDetails(IAnimal[] list) {
        // TODO Loop through all the animals in the given list, and print their details as shown in the lab handout.

        for (IAnimal animal : list) {
            System.out.println(animal.myName() + " says " + animal.sayHello());
            System.out.print(animal.myName() + " is a ");

            if (animal.isMammal()) {
                System.out.println("mammal");
            } else {
                System.out.println("non-mammal");
            }

            System.out.println("Did I forget to tell you that I have " + animal.legCount() + " legs" + "?");


            // TODO If the animal also implements IFamous, print out that corresponding info too.

            if (animal instanceof IFamous) {
                System.out.println("This is a famous name of my animal type: " + ((IFamous) animal).famous());
            }


            // TODO Use println below to break between each animal
            System.out.println("--------------------------------------------------------------");
        }
    }

    public static void main(String[] args) {
        new AnimalProgram().start();
    }
}
