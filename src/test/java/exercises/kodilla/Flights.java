package exercises.kodilla;

import java.util.ArrayList;

public class Flights {
    public static void main(String[] args) {
        /*Flight lot = new Flight("Krakow", "Gdansk");
        System.out.println(lot.getDetails());*/

        FlightsDatabase database = new FlightsDatabase();
        database.checkIfFlightExists("Kraków","Gdańsk");;
        database.displayFlightsFromCity("Kraków");
        database.displayFlightsToCity("Warszawa");

        ArrayList<String> cities = database.getCities();
        System.out.println(cities);

        Flight cheapestFlight = database.getCheapestFlight();
        System.out.println("Cheapest flight = " + cheapestFlight.getDetails());

        /*
        String first = new String("test");
        String second = new String("test");
        if (first.equals(second)) {
            System.out.println("The same values");
        }
        else {System.out.println("They are different");}

        ComputerItems computer = new ComputerItems();
        computer.displayItems();

        System.out.println(computer.isDivided(4,18));
        System.out.println(computer.getEvenSum(5,9));
        computer.getNumbers(5, -2);
        */
    }
}

class Flight {
    String departures;
    String arrivals;
    int price;

    public Flight(String departures, String arrivals, int price
    ) {
        this.departures = departures;
        this.arrivals = arrivals;
        this.price = price;
    }

    public String getDetails() {
        return "Flight from " + this.departures + " to " + this.arrivals +  " costs " + this.price;
    }
      /*  public String getDepartures() {
        return this.departures; }

       public void fromTo() {
        System.out.println("Flight from " + this.departures + " to " + this.arrivals); }*/
}




class FlightsDatabase {
    ArrayList<Flight> flights = new ArrayList<Flight>();

    public FlightsDatabase() {
        this.flights.add(new Flight("Berlin", "Moskwa", 1000));
        this.flights.add(new Flight("Kraków", "Warszawa", 900));
        this.flights.add(new Flight("Gdynia", "Koszalin", 800));
        this.flights.add(new Flight("Kraków", "Rzeszów",750));
    }

    public void checkIfFlightExists(String start, String end) {
        boolean notExist = true;
        for (Flight flight : this.flights)
        //for (int i = 0; i < this.flights.size(); i++) {
        //    Flight flight = this.flights.get(i);
        {
            if (start.equals(flight.departures) && end.equals(flight.arrivals)) {
                System.out.println("Flight exist!");
                //notExist = false;
                //break;
                return;
            }
        }
        //if (notExist)
        System.out.println("Flight with given params don't exist");
    }

    /*public void getFlightsFromCity(String city) {
        boolean isNotFound = true;
        for (int i = 0; i < this.flights.size(); i++) {
            Flight flight = this.flights.get(i);
            if (city.equals(flight.departures)) {
                System.out.println("Flight found = " + flight.getDetails());
                isNotFound = false;
            }
        }
        if (isNotFound) System.out.println("Flight from " + city + " not found");
    }*/

    public ArrayList<Flight> getFlightsFromCity(String city) {
        ArrayList<Flight> result = new ArrayList<>();
        for (Flight flight : this.flights)
        //for (int i = 0; i < this.flights.size(); i++) {
         //   Flight flight = this.flights.get(i);
        {
            if (city.equals(flight.departures)) {
                result.add(flight);
            }
        }
        return result;
    }

    public void displayFlightsFromCity(String city) {
        ArrayList<Flight> result = getFlightsFromCity(city);
        displayFlights(result);
    }

    /*public void getFlightsToCity(String city) {
        for (int i=0; i<this.flights.size(); i++) {
            Flight flight = this.flights.get(i);
            if (city.equals(flight.arrivals)) {
                System.out.println("Flight found = " + flight.getDetails());
                return;
            }
        }
        System.out.println("Flight to " + city + " not found!");
    }*/

    public ArrayList<Flight> getFlightsToCity(String city) {
        ArrayList<Flight> result = new ArrayList<>();
        for (Flight flight : this.flights)
        //for (int i=0; i<this.flights.size(); i++) {
         //   Flight flight = this.flights.get(i);
        {
            if (city.equals(flight.arrivals)) {
                result.add(flight);
            }
        }
        return result;
    }

    public void displayFlightsToCity(String city) {
        ArrayList<Flight> result = getFlightsToCity(city);
        displayFlights(result);
    }

    public void displayFlights(ArrayList<Flight> results) {
        if (results.isEmpty()) {
            System.out.println("Flight not found");}
        for (Flight flight : results) {
        //for (int i = 0; i < results.size(); i++) {
        //    Flight flight = results.get(i);
            System.out.println(flight.getDetails());
        }
    }

    public ArrayList<String> getCities() {
        ArrayList<String> cities = new ArrayList<>();
        for (Flight flight : this.flights)
        //for (int i=0; i<this.flights.size(); i++) {
            //Flight flight = this.flights.get(i);
        {
            if (!cities.contains(flight.departures)) {
                cities.add(flight.departures);
            }
            if (!cities.contains(flight.arrivals)) {
                cities.add(flight.arrivals);
            }
        }
        return cities;
    }
    public Flight getCheapestFlight () {
        Flight cheapestFlight = null;
        for (Flight flight : this.flights){
            if (cheapestFlight == null || flight.price < cheapestFlight.price)
            {cheapestFlight = flight; }
        }
        return cheapestFlight;
    }

}


class ComputerItems {
    // https://kodilla.com/pl/wyzwanie-java-kolekcje?&utm_source=activecampaign&utm_medium=email&utm_campaign=s_wyzwanie_java&ac_source=activecampaign&ac_medium=email&ac_campaign=s_wyzwanie_java
    ArrayList<String> list = new ArrayList<String>();

    public ComputerItems() {
        list.add("test");
        list.add("test 1");
        list.add("test 2 ");
        list.add("test 3  ");
    }

    public void  displayItems() {
        for (int i=0; i<list.size(); i++) {
            String elementI = list.get(i);
            if (elementI.length() > 5) {
                System.out.println(elementI);
            }
        } }

    public int isDivided(int min, int max) {
        int res = 0;
        for (int i = min; i <= max; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                res = res + 1;
            }
        }
        return res; }

    public int getEvenSum(int min, int max) {
        int res = 0;
        for (int i = min; i <= max; i++) {
            if (i % 2 == 0) {
                res = res + i;
            }
        }
        return res; }

    public void getNumbers(int max, int min) {
        for (int i = max; i >= min; i--) {
            System.out.println(i); } }


}



