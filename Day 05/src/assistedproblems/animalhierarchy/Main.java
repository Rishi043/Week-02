package assistedproblems.animalhierarchy;

public class Main {
    public static void main(String[] args) {
        //Create an object of Dog class and call the display and makeSound method.
        Animal dog = new Dog("Sheru", 7);
        dog.display();
        dog.makeSound();

        //Create an object of Cat class and call the display and makeSound method.
        Animal cat = new Cat("Lily", 4);
        cat.display();
        cat.makeSound();

        //Create an object of Bird class and call the display and makeSound method.
        Animal bird = new Bird("Chick", 6);
        bird.display();
        bird.makeSound();
    }
}
