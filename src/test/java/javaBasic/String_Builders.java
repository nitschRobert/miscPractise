package javaBasic;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class String_Builders {
    public static void main(String[] args) {
        StringBuilder randomText = new StringBuilder("qwerty");
        randomText.append(" ");
        randomText.append("123");
        System.out.println(randomText);
        System.out.println(randomText.reverse());

        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());
    }
}
