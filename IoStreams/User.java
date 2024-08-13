//The transient keyword in Java is used to indicate that a particular field of an object should not be serialized
// When a field is marked as transient, it is excluded from this process.
import java.io.Serializable;

public class User implements Serializable{
    private String name;
    private String email;
    transient private String passwd;
    private int age;
    
    public User(String name, String email, String passwd, int age) {
        this.name = name;
        this.email = email;
        this.passwd = passwd;
        this.age = age;
    }

    public void displayDetails(){
        System.out.println("Name : " + name);
        System.out.println("email : " + email);
        System.out.println("age : " + age);
        System.out.println("Password : " + passwd);

    }
}