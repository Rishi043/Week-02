package assistedproblems.animalhierarchy;

//Create a class Dog which will inherit the Animal class.
class Dog extends Animal{
    //Create a constructor which will take name and age as parameters.
    Dog(String name, int age){
        this.name = name;
        this.age = age;
    }

    //Override the makeSound method and print "Dog Barks!!!".
    public void makeSound(){
        System.out.println("Dog Barks");
    }
}

