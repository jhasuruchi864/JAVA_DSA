package javapillars;

abstract class Animal {
    abstract void sound();
}

class Cat extends Animal {
    void sound() {
        System.out.println("Cat meow");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

  public class Abstraction {
    public static void main(String[] args) {

        Cat c = new Cat();
        c.sound();

        Dog d = new Dog();
        d.sound();

    }
}
