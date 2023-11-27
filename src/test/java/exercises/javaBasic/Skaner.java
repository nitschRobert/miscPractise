package exercises.javaBasic;

import java.util.Scanner;

public class Skaner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What's your favourite fruit?");

        String fruit = scanner.nextLine();

       System.out.println("My favorite fruit is " +fruit);
        System.out.println("My favorite fruit length is " +fruit.length());
        System.out.println("Returns the char value at the specified index. " +fruit.charAt(0));
        System.out.println("Returns a new string that is a substring of this string. " +fruit.substring(1));
        System.out.println("Returns a new string that is a substring of this string. " +fruit.substring(1,3));
        System.out.println("Returns true if and only if this string contains the specified sequence of char values. " +fruit.contains("a"));
        System.out.println("Compares this string to the specified object. " +fruit.equals("abc"));
        System.out.println("Returns true if, and only if, length() is 0." +fruit.isEmpty());
        System.out.println("Concatenates the specified string to the end of this string. " +fruit.concat("qwerty"));
        System.out.println("Returns a new string resulting from replacing all occurrences of oldChar in this string with newChar " +fruit.replace("a","x"));
        System.out.println(fruit.toLowerCase());
        System.out.println(fruit.toUpperCase());
        System.out.println("Returns a copy of the string, with leading and trailing whitespace omitted. " +fruit.trim());
        System.out.println("Converts are given type into String. It is an overloaded method." + String.valueOf(fruit));

        /*int a =17;
        int b = 47;

        double aSqrt = Math.sqrt(a);
        double bSqrt = Math.sqrt(b);

        System.out.println(aSqrt);
        System.out.println(bSqrt);

        System.out.println((int)(Math.floor(Math.sqrt(b))- Math.ceil(Math.sqrt(a))+1));*/



    /*int value = scanner.nextInt();
        switch(value){
            case 10:
                System.out.println("The number is 10");
                break;
            case 20:
                System.out.println("The number is 20");
                break;
            case 30:
                System.out.println("The number is 30");
                break;
            default:
                System.out.println("No such number! :(");
        }*/
    }
}
