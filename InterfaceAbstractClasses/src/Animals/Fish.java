package Animals;

class Fish extends Animal implements LegCount {

    public int getLegCount() {
        return 0;
    }

    public String getCovering() {
        return SCALE;
    }

    public void makeSound() {
        System.out.print("Blub");
    }

    public boolean canFly() {
        return false;
    }
}