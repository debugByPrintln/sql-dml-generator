import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class GeneratePerson {
    public static void main(String[] args) throws IOException {
        int counter = 1;
        while (counter <= 5100){
            //player
            if (counter <= 5000){
                Person person = new Person(counter, false, 1);
                System.out.println(person);
            }

            //organizator
            else if (counter <= 5025){
                Person person = new Person(counter, null, 2);
                System.out.println(person);
            }

            //arbitr
            else if (counter <= 5050){
                Person person = new Person(counter, null, 3);
                System.out.println(person);
            }

            //staff
            else {
                Person person = new Person(counter, null, 4);
                System.out.println(person);
            }

            counter++;
        }
    }
}
