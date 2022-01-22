public class Dog extends Animal{

    public Dog(String name) {
        super(name);
    }

    public Dog() {
        super.name = "Dog";
    }

    public void bark() {
        System.out.println(this.name + " barks");
    }

    @Override
    public void eat() {
        super.eat();
    }

    @Override
    public void sleep() {
        super.sleep();
    }

    public String getName() {
        return super.getName();
    }

    @Override
    public void makeNoise() {
        this.bark();
    }
}
