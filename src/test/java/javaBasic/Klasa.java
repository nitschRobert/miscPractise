package javaBasic;

public class Klasa {
    //pola klasy = zmienne zadeklarowane w ciele klasy
    private String starName;
    private String starType;
    private int starNumber;

    private int typRef = 1234;

//konstruktor - przyjmuje 3 parametry i przypisuje wartości przekazane w parametrach do pól klasy
        /*
    public Klasa(String name, String type, int number) {
        starName = name;
        starType = type;
        starNumber = number;
    }*/

    public Klasa(String starName, String starType, int starNumber) {
        this.starName = starName;
        this.starType = starType;
        this.starNumber = starNumber;

        System.out.println("all = " + starName + starType + starNumber);
    }

    //kolejny konstruktor - domyślny - nie przyjmuje żadnych parametrów, jedynie tworzy obiekt danej klasy,
    public Klasa() {

    }

    public String getType() {
        return starType;
    }

    public void changeNumber (int change) {
        starNumber = starNumber + change;
    }

    public int printChangeNumber () {
        return starNumber;
    }



    public void printStarName() {
        System.out.println("Star Name = "+ starName);
    }

    public void printStarType() {
        System.out.println("Star Type = "+ starType);
    }

    public void printStarNumber() {
        System.out.println("Star Number = "+ starNumber);
    }

    public int getTypRef () {
        return typRef;
    }

    public void setTypRef (int ref) {
        typRef = ref;
    }

    public void koniesTestu ()
    {
        System.out.println("koniec testu");
    }

}
