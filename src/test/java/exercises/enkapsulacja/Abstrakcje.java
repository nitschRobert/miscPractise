package exercises.enkapsulacja;

public abstract class Abstrakcje {
    public abstract void printInformation();
    public void startClass(){
        System.out.println("Start!");
    }

    public static void main(String[] args) {
        Student student = new Student(50513);
        Lecturer lecturer = new Lecturer("John", "Smith");

        student.printInformation();
        student.startClass();

        lecturer.printInformation();
        lecturer.startClass();
    }
}


class Student extends Abstrakcje {
    private int idNumber;

    public Student(int idNumber) {
        this.idNumber = idNumber;
    }

    @Override
    public void printInformation() {
        System.out.println("Student id number is " + idNumber);
    }
}


class Lecturer extends Abstrakcje {
    private String firstName;
    private String lastName;

    public Lecturer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public void printInformation() {
        System.out.println("First name is "+ firstName);
        System.out.println("Last name is "+ lastName);
    }
}




