package javaBasic;
import java.util.Arrays;

public class Edabit {
        public static void sortByLength(String str) {
            String[] s = str.split(" ");
            for (int i = 0; i < s.length-1; i++)
            {
                String temp = s[i];
                if (s[i].length()>s[i+1].length())
                {
                    s[i]=s[i+1];
                    s[i+1]=temp;
                }
            }
            System.out.println(String.join(" ", s));
        }

    public static void main(String[] args) {
        String str = "This is the end";
        sortByLength(str);
    }
}
