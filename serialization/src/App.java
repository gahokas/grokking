import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Date;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        
        FileOutputStream fos = new FileOutputStream("file.tmp");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
  
        Person person = new Person("Joe", "Shlabotnik", new Date());

        oos.writeObject(person);
        oos.close();
        fos.close();

        FileInputStream fis = new FileInputStream("file.tmp");
        ObjectInputStream ois = new ObjectInputStream(fis);

        Person person2 = (App.Person) ois.readObject();

        System.out.println("Got this from the file: " + person2.print());

        ois.close();
        fis.close();
    }

    public static class Person implements Serializable {
        private String firstName;
        private String lastName;
        private Date birthDate;

        static final long serialVersionUID = 1L;

        Person(String firstName, String lastName, Date birthDate) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.birthDate = birthDate;
        }

        public String print() {
            return firstName + " " + lastName + " " + birthDate;
        }

    }

}
