package Animals;

class Cat extends Animal implements LegCount {
    public int getLegCount() {
        return 4;
    }

    public String getCovering() {
        return FUR;
    }

    public void makeSound() {
        System.out.print("Meow");
    }

    public boolean canFly() {
        return false;
    }
}