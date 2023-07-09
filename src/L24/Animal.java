package L24;
interface Speakable
{
    default void speak(){
        System.out.println("Govorit Animal");
    }
}
 public abstract class Animal{
    String name;
    Animal(String name)
    {
    this.name = name;
    }
    abstract void eat();
    abstract void sleep();
}
abstract class Fish extends Animal
{
    Fish(String name)
    {
        super(name);
    }
    void sleep(){
        System.out.println("Vsegda interesno smotretb kak spyat ribi");
    }
    abstract void swim();
}
abstract class Bird extends Animal implements Speakable
{
    Bird(String name)
    {
        super(name);
    }
    abstract void letatb();

    public void speak() {
        System.out.println(name +" Sings");
    }
}
abstract class Mammal extends Animal implements Speakable {
    Mammal(String name) {
        super(name);
    }
    abstract void run();
}
class Mechenosets extends Fish
{
   Mechenosets(String name)
   {
       super(name);
   }
    @Override
    void eat() {
        System.out.println("Mechenosets Kushaet KORM");
    }

    @Override
    void swim() {
        System.out.println("Plavaet Mechenosets Bistro");
    }
}
class Pingvin extends Bird{
    Pingvin(String name) {
        super(name);
    }

    @Override
    void letatb() {
        System.out.println("Pingvin is cannot fly");
    }

    @Override
    void eat() {
        System.out.println("Pingvin Eat fish");
    }

    @Override
    void sleep() {
        System.out.println("Pingvin sleeps");
    }

    @Override
    public void speak() {
        System.out.println("Pingvin bad songs");
    }
}
class Lev extends Mammal {
    Lev(String name) {
        super(name);
    }

    @Override
    void run() {
        System.out.println("Lev run");
    }

    @Override
    void eat() {
        System.out.println("Lev est myaso");
    }

    @Override
    void sleep() {
        System.out.println("Lev spit");
    }
}
class TestI{
    public static void main(String[] args) {
        Mechenosets m1 = new Mechenosets("Petya");
        System.out.println(m1.name);
        m1.eat();
        m1.swim();
        m1.sleep();
        Speakable s1 = new Pingvin("Vanya");
        s1.speak();
        Animal a1 = new Lev("Denis");
        System.out.println(a1.name);
        a1.eat();
        a1.sleep();
        Mammal mm2 = new Lev("Stepan");
        System.out.println(mm2.name);
        mm2.run();
        mm2.eat();
        mm2.speak();
        mm2.sleep();

    }
}
