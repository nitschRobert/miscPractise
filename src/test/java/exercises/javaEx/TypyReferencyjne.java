package exercises.javaEx;

import org.junit.Test;

import java.time.LocalDate;
import java.util.Date;


public class TypyReferencyjne {

    @Test
    public void example1() {
        int firstInt = 10;
        int secondInt = firstInt;
        firstInt =21;

        System.out.println("firstInt = " + firstInt);
        System.out.println("secondInt = " + secondInt);
    }

    @Test
    public void example2() {
        Klasa first = new Klasa();
        // zmienna typu 'Klasa' przechowuje referencję do obiektu 'first'
        Klasa second = first;
        first.setTypRef(14);

        System.out.println(first.getTypRef());
        System.out.println(second.getTypRef());
    }

    @Test
    public void example3() {
        String firstString = "jeden";
        String secondString = firstString;
        firstString = "dwa";

        System.out.println(firstString);
        System.out.println(secondString);
    }

    @Test
    public void example4() {
        int digits = 12345;
        StringBuilder revDigits = new StringBuilder(String.valueOf(digits));
        //System.out.println(revDigits.reverse());
        //System.out.println(Integer.valueOf(revDigits.toString()));
        int reversed = Integer.parseInt(revDigits.reverse().toString());
        System.out.println(reversed);
    }

    @Test
    public void example5() {
        Date today = new Date();
        today.getTime();
        System.out.println("time:" + today.toString());
            }

    @Test
    public void example6() {
        int month = 11;
        int day = 11;
        int year = 2020;

        LocalDate dt = LocalDate.of(year, month, day);
        System.out.println(dt.getDayOfWeek().toString());
        }

    @Test
    public void example7() {
        String title = "Hello world";
        int length = title.length();
        System.out.println(length);
        int temporaryVariable  = String.valueOf(length).length();
        System.out.println(temporaryVariable);
    }
}
