package exercises.enkapsulacja;

class AccountPrivate {
    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}


/* As we mentioned earlier, the private modifier means access only within the class.
However, it is possible to access private fields using getter and setter methods.
The get methods return
        the variable value, and the set method set the value. */

/* We can generate a get and set method using the IDE.
Use the alt+insert shortcut and then select Getter and Setter option from the windows and click ok button.
 */

class AccountPublic {
    public String email = "email@mail.com";
}


/* The public access modifier has the widest range of all access modifiers
because it means access from anywhere in the program.*/


public class AccountMain {
    public static void main(String[] args) {
        AccountPrivate account = new AccountPrivate();
        account.setEmail("123@mail.com");
        System.out.println(account.getEmail());


        AccountPublic account2 = new AccountPublic();
        System.out.println(account2.email);

        Point point = new Point();
        point.setX(10);
        point.setY(20);
        System.out.println("x = " +point.getX()+ " y = "+point.getY());

    }
}
