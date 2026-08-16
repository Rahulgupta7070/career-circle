package day05.polymorphism;

public class Driver {
    public static void main(String[] args) {


        Animal a;
        a=new Cat();
        a.sound();
        
        
        a=new Dog();
        a.sound();
        
    }
    
}
