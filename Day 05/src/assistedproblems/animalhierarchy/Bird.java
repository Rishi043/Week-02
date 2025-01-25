package assistedproblems.animalhierarchy;

//Create a class Bird which will inherit the Animal class.
class Bird extends Animal{
    //Create a constructor which will take name and age as parameters.
    Bird(String name, int age){
        this.name = name;
        this.age = age;
    }
    //Override the makeSound method and print "Bird Chirps".
    @Override
    public void makeSound(){
        System.out.println("Bird Chirps");
    }
}

