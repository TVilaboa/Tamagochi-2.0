/**
 * Created with IntelliJ IDEA.
 * Author: Tomás Vilaboa
 * Project: Tamagochi-2.0
 * Date: 19/11/13
 * Time: 19:31
 */
public class CustomListener {


    public void sick(Dog dog) {
        if (dog.isSick())
            System.out.println("Dog is sick :(");
        else
            System.out.println("Dog has been healed :)");
    }

    public void alone(Dog dog) {
        if (dog.isAlone())
            System.out.println("Dog has been abandoned :(");
        else
            System.out.println("Dog has a home :)");
    }

    public void hungry(Dog dog) {
        String str = dog.isHungry() ? "Dog is hungry" : "Dog ate his food";
        System.out.println(str);
    }

    public void alive(Dog dog) {
        String str = dog.isAlive() ? "Dog is alive :)" : "Dog has died :(";
        System.out.println(str);
    }

}
