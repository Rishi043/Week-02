package assistedproblems.animalhierarchy;

//create a class Animal. The class will have a method makeSound which will print "Animal make sound".
class Animal{
    protected String name;
    protected int age;

    //Create a method makeSound which will print "Animal make sound".
    public void makeSound(){
        System.out.println("Animal make sound");
    }

    //Create a method display which will print the name and age of the animal.
    public void display(){
        System.out.println("Name: "+ name +"\nAge: "+ age);
    }
}
