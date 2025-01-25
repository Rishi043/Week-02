package assistedproblems.animalhierarchy;

//Create a class Cat which will inherit the Animal class.
class Cat extends Animal{
    //Create a constructor which will take name and age as parameters.
    Cat(String name, int age){
        this.name = name;
        this.age = age;
    }
    //Override the makeSound method and print "Cat Meows".
    @Override
    public void makeSound(){
        System.out.println("Cat Meows");
    }
}