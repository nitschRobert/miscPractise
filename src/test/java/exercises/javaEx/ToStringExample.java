package exercises.javaEx;

import org.junit.jupiter.api.Test;

public class ToStringExample {
        String name = "MyCar";
        int year = 2002;

    @Override
    public String toString() {
        return "ToStringExample{" +
                "name='" + name + '\'' +
                ", year=" + year +
                '}';
    }

    @Test
    public void test(){
        ToStringExample ex = new ToStringExample();
        System.out.println(ex);
    }
}





