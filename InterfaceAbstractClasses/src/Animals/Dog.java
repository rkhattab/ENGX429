package Animals;

/**
 *
 * @author reemkhattab
 */

class Dog extends Animal implements LegCount {

    public int getLegCount() {
        return 4;
    }

    public String getCovering() {
        return FUR;
    }

    public void makeSound() {
        System.out.print("Woof");
    }

    public boolean canFly() {
        return false;
    }
}