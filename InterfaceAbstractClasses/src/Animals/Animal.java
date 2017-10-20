package Animals;

public abstract class Animal {
    
    String FUR="fur";
    String FEATHER = "feather";
    String SCALE = "scale";
    String SHELL = "shell";
    String SKIN = "skin";

    abstract String getCovering();

    abstract void makeSound();
    
    abstract boolean canFly();
}
