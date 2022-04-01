package oop.Animals;

public class Animal {
    private String name;
//    możemy zainicjalizować w tym miejcu domyślną wartością lub zrobić to w konstruktorze domyślnym
    int age = 0;

    public Animal(){
//        Konstruktor bez parametrów nazywany jest konstruktorem domyślnym. Nie musimy go definiować (tworzyć jego
//        implementacji) jeśli nie potrzebujemy, ale będzie to konieczne jeśli zadeklarujemy jakikolwiek inny konstrukor
        System.out.println("Konstruktor zwierzęcia");
        this.name = "unknown";
    }

    public Animal(String name){
//        Konstruktor z parametrem, inicjalizującą obiekt z przypisaniem imienia
        System.out.println("Konstruktor zwierzęcia z parametrem String");
        this.name = name;
    }

    public Animal(String name, int age){
        System.out.println("Konstruktor zwierzęcia z dwoma parametrami");
        this.name = name;
        this.age = age;
    }

    public void useVoice(){
        System.out.println("Każde zwierzę wydaje inny głos");
    }

    public void setName(String name){
        this.name = name;
    }
//    Setter - czyli metoda pozwalająca na ustawienie wartości danego pola (w tym wypadku name), jego nazwę zaczynamy
//    od słówka set

    //zaimplementuj metodę 'getName' zwracającą nazwę zwierzęcia
    public String getName(){
        return this.name;
    }
//    Getter - metoda pozwalająca na pboranie wartości danego pola (w tym wypadku name), jego nazwę zaczynamy
//    od słówka get

    @Override
    public String toString(){
        return "Zwierzę | nazwa=" + name;
    }
//    Nadpisujemy (Override) metodę klasy bazowej (w tym wypadku klasą bazową jest Object). Dzięki temu mamy kontrolę
//    nad tym w jaki sposób nasz obiekt reprezentowany jest w postaci stringa (łańcucha znaków)

    public void printInfo(){
        System.out.println("Cześć nazywam się " + name + "\nMój wiek to " + this.age + "\nMój głos:");
        useVoice();
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
