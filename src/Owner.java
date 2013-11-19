/**
 * Created with IntelliJ IDEA.
 * Author: Tomás Vilaboa
 * Project: Tamagochi-2.0
 * Date: 19/11/13
 * Time: 18:28
 */
public class Owner extends Person {

    private Dog pet;

    public void buyDog() {
        pet = new Dog();
    }

    public void feedDog() {
        pet.eat();
    }

    public void giftDog() {
        pet.setAlone(true);
        pet = null;
    }
}
