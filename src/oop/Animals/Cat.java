package oop.Animals;

public class Cat extends Animal{
    private boolean nineLives = true;
//    Trochę mało 'życiowy' przykład, ale miałem na myśli cechę charakterystyczną dla kota, której nie mają wszystkie
//    zwierzęta (klasa Animal), a jedynie ten specyficzny typ, czyli kot

    public Cat(){
        System.out.println("Konstruktor kota");
    }

    public Cat(String name) {
        System.out.println("Konstruktor z parametrem w klasie kot");
        this.setName(name);
    }

    @Override
    public void useVoice(){
        System.out.println("Meeeeooowww");
    }
//    Nadpisanie metody klasy bazowej useVoice. W tym wypadku klasą bazową jest Animal. Nadpisanie pozwala na
//    doprecyzowanie jaki dźwięk wydaje ten szczególny typ zwięrzęcia czyli kot.

//    @Override
//    public String toString() {
//        return "Cat{}";
//    }
//    toString() wygenerowany przez InteliJ

    //Przesłoń metodę 'toString' klasy bazowej
    @Override
    public String toString(){
        return "Kot | nazwa=" + this.getName();
    }

    public void setNineLives(boolean nineLives) {
        this.nineLives = nineLives;
    }

    public boolean isNineLives() {
        return nineLives;
    }

    public void huntMouse(){
        System.out.println("Poluję na myszy");
    }
//    Dodanie metody specyficznej dla danego typu - w tym wypadku polowanie na mysz

}
