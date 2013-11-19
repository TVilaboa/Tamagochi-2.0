/**
 * Created with IntelliJ IDEA.
 * Author: Tomás Vilaboa
 * Project: Tamagochi-2.0
 * Date: 19/11/13
 * Time: 18:27
 */
public class Vet extends Person {

    public void healDog(Dog dog) {
        dog.setSick(false);

    }

    public void sacrificeDog(Dog dog) {
        dog.die();
    }
}
