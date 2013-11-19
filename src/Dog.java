/**
 * Created with IntelliJ IDEA.
 * Author: Tomás Vilaboa
 * Project: Tamagochi-2.0
 * Date: 19/11/13
 * Time: 18:24
 */
public class Dog {

    private boolean isAlone, isSick, isHungry;
    private boolean isAlive = true;
    public CustomListener listener = new CustomListener();


    public void eat() {
        setHungry(false);
    }

    public void die() {
        setAlive(false);

    }

    public boolean isAlone() {
        return isAlone;
    }

    public boolean isSick() {
        return isSick;
    }

    public boolean isHungry() {
        return isHungry;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setSick(boolean sick) {
        isSick = sick;
        listener.sick(this);
    }

    public void setAlone(boolean alone) {
        isAlone = alone;
        listener.alone(this);
    }

    public void setHungry(boolean hungry) {
        isHungry = hungry;
        listener.hungry(this);
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
        listener.alive(this);
    }
}
