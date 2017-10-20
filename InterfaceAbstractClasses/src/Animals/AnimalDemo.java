package Animals;

abstract class AnimalDemo {

    public static void main(String[] args) {
        System.out.println("Animal Type Test:");
     
        Duck aDuck = new Duck(); 
        Cat aCat = new Cat();
        Dog aDog = new Dog();
        Fish aFish = new Fish();
        FlyingFish aFlyingFish = new FlyingFish();
        
        System.out.println("A duck has " + aDuck.getLegCount() + " legs.");
        System.out.println("A cat has " + aCat.getLegCount() + " legs.");
        System.out.println("A dog has " + aDog.getLegCount() + " legs.");
        System.out.println("A fish has " + aFish.getLegCount() + " legs.");
        System.out.println("A flyingfish has " + aFlyingFish.getLegCount() + " legs.");
       
        System.out.println("-------------------------------------");
        
        System.out.println("A duck has " + aDuck.getCovering() + "'s as its covering.");
        System.out.println("A cat has " + aCat.getCovering() + " covering.");
        System.out.println("A dog has " + aDog.getCovering() + " covering.");
        System.out.println("A fish has " + aFish.getCovering() + "'s as its covering.");
        System.out.println("A flyingfish has " + aFlyingFish.getCovering() + "'s as its covering.");
        
        System.out.println("-------------------------------------");
        
        System.out.println("A duck makes the sound: ");
        aDuck.makeSound();
        System.out.println();
        System.out.println("A cat makes the sound: ");
        aCat.makeSound();
        System.out.println();
        System.out.println("A dog makes the sound: ");
        aDog.makeSound();
        System.out.println();
        System.out.println("A fish makes the sound: ");
        aFish.makeSound();
        System.out.println();
        System.out.println("A flyingfish makes the sound: ");
        aFlyingFish.makeSound();
        System.out.println();
        System.out.println("--------------------------------------");
        System.out.println();
        
        System.out.println("Can a duck fly? " + aDuck.canFly());
        System.out.println("Can a cat fly? " + aCat.canFly());
        System.out.println("Can a dog fly? " + aDog.canFly());
        System.out.println("Can a fish fly? " + aFish.canFly());
        System.out.println("Can a flyingfish fly? " + aFlyingFish.canFly());
        
        System.out.println();
        System.out.println("--------------------------------------");
  
        
    }
    
}
