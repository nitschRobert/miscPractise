package kodilla;

// https://kodilla.com/pl/wyzwanie-java-wprowadzenie?&utm_source=activecampaign&utm_medium=landing&utm_campaign=s_wyzwanie_java&ac_source=activecampaign&ac_medium=landing&ac_campaign=s_wyzwanie_java
public class phones {
    public static void main(String[] args) {

        // TypZmiennej nazwaZmiennej = new NazwaKlasy();
        MobilePhone phone = new MobilePhone("200g", 400);
        // możemy dostać się do zmiennych w klasie, stosując zapis nazwaObiektu.nazwaZmiennej.
        System.out.println(phone.weight + " " + phone.price);
        //.
        phone.displayValues();
        System.out.println(phone.getParametrs());
        //.
        phone.checkPrice();


        MobilePhone oldPhone = new MobilePhone("400g", 600);
        System.out.println(oldPhone.weight + " " + oldPhone.price);
        oldPhone.checkPrice();

        MobilePhone newPhone = new MobilePhone("100g", 123);
        System.out.println(newPhone.weight + " " + newPhone.price);
        newPhone.checkPrice();
        //.
        phone.displayEvenNumbers();
        phone.displayEvenNumbers2(24);
        phone.displayEvenNumbers3(10,16);
    }
}

    class MobilePhone {
        String weight;
        int price;

        public MobilePhone(String weight, int price) {
            this.weight = weight;
            this.price = price;
        }
        // konstruktor klasy MobilePhone, który przyjmuje argument typu String.
        // otrzymaną wartość przypisujemy do zmiennej w klasie (przypisywanie zawsze odbywa się z prawej do lewej)
        // tworząc obiekt typu MobilePhone, wywołujemy konstruktor oraz przekazujemy wartość, jaka ma być przypisana do zmiennej weight.

        public void displayValues() {
            System.out.println(this.weight + " " + this.price);
        }

        public String getParametrs() {
            return this.weight + " " + this.price;
        }

        public void checkPrice() {
            if (this.price < 200) {
                System.out.println("price is very good");
            } else if (this.price < 300) {
                System.out.println("price is good");
            } else if (this.price < 550) {
                System.out.println("price could be lower");
            } else {
                System.out.println("this phone is too expensive");
            }
        }

        public void displayEvenNumbers() {
            for (int i = 0; i < 21; i = i + 2) {
                System.out.println(i); }
        }
        public void displayEvenNumbers2(int max) {
            for (int i = 0; i < max; i = i + 2) {
                System.out.println(i); }
        }
        public void displayEvenNumbers3(int min, int max) {
            for (int i = min; i < max; i++) {
                if (i % 2 == 0) {
                    System.out.println(i); }
            }
        }
    }