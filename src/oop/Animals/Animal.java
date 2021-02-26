package oop.Animals;

public class Animal {
    private String name;

    public Animal(){
        System.out.println("Konstruktor zwierzęcia");
    }

    public void useVoice(){
        System.out.println("Każde zwierzę wydaje inny głos");
    }

    public void setName(String name){
        this.name = name;
    }

    //zaimplementuj metodę 'getName' zwracającą nazwę zwierzęcia

    @Override
    public String toString(){
        return "Zwierzę | nazwa=" + name;
    }

    public void printInfo(){
        System.out.println("Cześć nazywam się " + name + "\nMój głos:");
        useVoice();
    }
}
