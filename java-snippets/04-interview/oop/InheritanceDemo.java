public class InheritanceDemo {
    static class Animal {
        void eat(){
            System.out.println("Animal is eating");
        }
    }

    static class Dog extends Animal {
        void bark(){
            System.out.println("Dog is barking");
        }
    }

    public static void main(String[] args){
        Dog d = new Dog();
        d.eat();
        d.bark();

        Animal a = new Dog();
        a.eat();
        // a.bark(); -> compile error, parent reference cannot see child-only method
        System.out.println("Dog IS-A Animal -> code reuse via extends");
    }
}
