package Animals;

public class Duck extends Animal implements LegCount {
    public int getLegCount() {
        return 2;
    }

    public String getCovering() {
        return FEATHER;
    }

    public void makeSound() {
        System.out.print("Quack");
    }

    public boolean canFly() {
        return true;
    }

}