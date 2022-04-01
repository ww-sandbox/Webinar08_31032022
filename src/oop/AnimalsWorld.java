package oop;

import oop.Animals.Animal;
import oop.Animals.Cat;
import oop.Animals.Dog;

public class AnimalsWorld {
    public static void main(String[] args) {
        System.out.println("### ZWIERZAK ###");
        Animal animal = new Animal();
        animal.printInfo();
//        animal.name = "zwierz";
//        Jeśli w animal 'name' zostałoby stworzone z modyfikatorem public, moglibyśmy przypisać imię w ten sposób.
//        Przy wykorzystaniu private, nie jest to możliwe. O enkapsulacji pomówimy na kolejnych zajęicach.
        animal.setName("zwierz");
//        Jeśli pole jest ustawione jako private, musimy skorzystać z setterów i getterów
        animal.printInfo();
        String animalsName = animal.getName();
        System.out.println(animal);
//        Dzięki wykorzystaniu nadpisania metody toString() możemy uzyskać czytelną dla człowieka reprezentację naszego
//        obiektu i modyfikować ją wraz z rozwojem klasy lub przy zmianie wymagań

//        int a = 2;
//        String c = "litera c";
//        String c = new String("litera c");
//        Te przykłady powstały aby zaprezentować dlaczego przy tworzeniu instancji naszej klasy musimy stosować słówko
//        'new'. Bez tego słówka możemy inicjalizować typy prymitywne, lub tak szczególne jak String, ale jak widać
//        String również może powstać ze słówkiem kluczowym 'new'

        Animal b = new Animal("Filemon", 5);
        b.printInfo();
//        Animal x = animal;
        //Nadaj imię zwierzęciu i wyświetl informacje jeszcze raz
//        To zadanie realizowaliśmy już wyżej

        System.out.println("### KOT ###");
        //Stwórz instancję klasy 'Cat' i sprawdź różnicę w wyświetlaniu
        Cat cat = new Cat();
        cat.printInfo();
        Cat cat2 = new Cat("mruczek");
        System.out.println(cat2);
        cat2.huntMouse();
        cat.huntMouse();

        System.out.println("### DOG ###");
        Dog dog = new Dog();
        dog.printInfo();
        Dog dog2 = new Dog("reksio");
        dog2.printInfo();
    }

}
