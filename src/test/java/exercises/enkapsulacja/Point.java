package exercises.enkapsulacja;

public class Point {
    private int x;
    private int y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }


    /*
Encapsulation describes the ability of an object to hide its data and methods from the rest of the world
and is one of the fundamental principles of object-oriented programming.
In Java, a class encapsulates the fields, which hold the state of an object,
and the methods, which define the actions of the object. Encapsulation enables you to write reusable programs. It also enables you to restrict access only to those features of an object that are declared public. All other fields and methods are private and can be used for internal object processing. Source from Oracle doc


To achieve encapsulation in Java you must:

Declare the variables of a class as private.

Implement public getters and setters in classes.
     */
}
