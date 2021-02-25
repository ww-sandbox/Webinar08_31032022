package oop;

public class Cat extends Animal{
    public Cat(){
        System.out.println("Konstruktor kota");
    }

    @Override
    public void useVoice(){
        System.out.println("Meeeeooowww");
    }

    //Przesłoń metodę 'toString' klasy bazowej
}
