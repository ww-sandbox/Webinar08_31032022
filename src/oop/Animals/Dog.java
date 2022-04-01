package oop.Animals;

public class Dog extends Animal{
    public Dog(){
        System.out.println("Jestem w konstruktorze domyślnym psa");
    }

    public Dog(String name){
        super(name);
        System.out.println("Jestem w konstruktorze z pamarametrem psa");
    }
}
