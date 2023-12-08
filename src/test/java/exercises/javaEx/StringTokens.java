package exercises.javaEx;

import java.util.Scanner;

public class StringTokens {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String s = scan.nextLine().trim();
    if(s.equals("")) {
        System.out.println("0");}
    else if(s.length()>400000){ return;}
    else {
        String[] res = s.split("[ !,?.\\_'@]+");
        System.out.println(res.length);
        for (String r: res)
            System.out.println(r);}

    scan.close();
}
}
